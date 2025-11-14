package Lab6;
import javax.swing.*;
import java.util.LinkedList;
import java.util.Iterator;

public class LinkedListDemo {

    private Node first; //First node in the list (head)
    private int  size; //Size of the linked list

    public LinkedListDemo() { //Constructor for the single linked list
        first = null;
        size = 0;
    }

    class Node{ //Inner Node Class
        public Integer data; //Number within the node
        public Node next; //Pointer to next node

        public Node(Integer data){
            this.data = data;
            this.next = null;
        }
        public Node(Integer data, Node next){
            this.data = data;
            this.next = next;
        }
    }

    public void addFirst(Integer answer){
        Node newNode = new Node(answer,first);
        first = newNode;
        size++;
    }

    public void addLast(Integer answer){
        Node newNode = new Node(answer,null);
        if(size == 0){
            first = newNode;
        } else if (size >= 1) {
            first.next = newNode;
        }
    }

    public void removeFirst(){
    }

    public static void  main(String[] args) {
        LinkedListDemo NumList = new LinkedListDemo();
        JOptionPane.showInputDialog(null,"");
        NumList.addFirst(67);
        NumList.addLast(41);
    }
}