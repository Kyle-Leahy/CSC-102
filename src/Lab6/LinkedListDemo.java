package Lab6;
import javax.swing.*;

public class LinkedListDemo {

    private Node first; //First node in the list (head)
    private int  size; //Size of the linked list

    public LinkedListDemo() { //Constructor for the single linked list
        first = null;
        size = 0;
    }

    class Node{ //Inner Node Class
        public int data; //Number within the node
        public Node next; //Pointer to next node

        public Node(int data){
            this.data = data;
            this.next = null;
        }
        public Node(int data, Node next){
            this.data = data;
            this.next = next;
        }
    }

    public void addFirst(int answer){
        Node newNode = new Node(answer,first);
        newNode.data = answer;
        newNode.next = first;
        first = newNode;
        size++;
    }

    public void addLast(int answer){
        Node newNode = new Node(answer,null);
        if(size == 0){
            first = newNode;
        } else if (size >= 1) {
            first.next = newNode;
        }
    }

    public void removeFirst(){
        try{
            int data = first.data;
            first = first.next;
            size--;
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e.getMessage(),"There is no first Node!",JOptionPane.ERROR_MESSAGE);
        }
    }



    public static void  main(String[] args) {
        LinkedListDemo NumList = new LinkedListDemo();
        JOptionPane.showInputDialog(null,"");
        NumList.addFirst(67);
        NumList.addLast(41);
        NumList.removeFirst();
        System.out.println(NumList.size);
    }
}