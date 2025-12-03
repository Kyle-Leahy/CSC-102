package Lab6;
import javax.swing.*;
import java.util.NoSuchElementException;

public class LinkedListDemo {
    private static Node first; //First node in the list (head)
    private static int size; //Size of the linked list

    public LinkedListDemo() { //Constructor for the single linked list
        first = null; //First node is a null object
        size = 0; //Creating variable to track size with expansions etc.
    }
    public static class Node { //Inner Node Class
        int data; //Number within the node
        Node next; //Pointer to next node

        public Node(int data) {//Head of size 1 or end Node cases
            this.data = data;
        }

        public Node(int data, Node next) { //Middle Node or Node with a next one
            this.data = data;
            this.next = next;
        }
    }


    static class LinkedListIterator implements ListIteratorClass {
        private Node current; //Current pointer
        private Node previous; //Previous pointer

        public LinkedListIterator() {
            current = null;
            previous = null;
        }

        @Override
        public boolean hasNext() {
            return current.next != null;
        }

        @Override
        public int next() {
            if (!hasNext()) {throw new NoSuchElementException();}
            previous = current;
            current = current.next;
            return current.data;
        }

        public void remove() { //Removing the current index/pointer
            if (current == first) {removeFirst();}
            else {previous.next = current.next;}
            current = previous;
        }

        public void add(int answer){
            if (current == null) {
                addFirst(answer);
                current = first;
            }else{
                current = new Node(answer, current.next);
            }
        }

        public void addFirst(int answer) {
            first = new Node(answer, first);
            size++;
            if(current == null){
                current = first;
            }
        }

        public void addLast(int answer) {
            Node newNode = new Node(answer);
            if (size == 0) {
                first = newNode;
            } else {
                Node temp =  first;
                while (temp.next != null) {temp = temp.next;}
                temp.next = newNode;
            }
            size++;
        }

        public void removeFirst() {
            first.data = 0;
            first = first.next;
            size--;
        }

        public void removeLast(){
            if(first.next == null){return;}
            else{
                Node temp =  first;
                while(temp.next.next != null){ //
                    temp = temp.next;
                }
                temp.next = null;
            }
            size--;
        }

        public void getLast(){
            if(first == null){return;}
            Node temp  = first;
            while(temp.next != null){
                temp = temp.next;
            }
            System.out.println("The last element of the list is " + temp.data);
        }

        public void getFirst4(){
            Node temp = first;
            int i = 0;
            while(i < 4 && temp != null){
                System.out.print("Node: "+(i+1)+": "+temp.data+"\n");
                temp = temp.next;
                i++;
            }
            if(i < 4){
                System.out.println("This list does not contain 4 nodes, only: " + i);
            }
        }

        public String toString(){
            return String.valueOf(current.data);
        }

        public String find(int answer){
            Node temp = first;
            int index = 0;
            while(temp.data!=answer){
                temp = temp.next;
                index++;
                if(temp.data == answer){
                    return "Your number is in node: "+ index;
                }
            }
            return "Your number is not in this list.";
        }
    }

    public static void main(String[] args) {
        LinkedListDemo.LinkedListIterator iter = new LinkedListIterator();
        JOptionPane.showMessageDialog(null, "Kyle Leahy\nCSC 102\nLab 6 (hefty)");
        iter.addFirst(67);
        iter.addFirst(72);
        iter.addFirst(55);
        iter.addFirst(78);
        iter.addFirst(213);
        iter.addLast(41);
        System.out.println(iter.toString());
        System.out.println(iter); // <- Either work ^
        iter.getLast();
        iter.getFirst4();
        iter.removeFirst();
        iter.removeLast();
        System.out.println(iter.find(55)); //Only one working improperly
        System.out.println(size);
    }
}