package Lab6;
import javax.swing.*;
import java.util.NoSuchElementException;

public class LinkedListDemo {
    private static Node first; //First node in the list (head)
    private static int size; //Size of the linked list

    public LinkedListDemo() { //Constructor for the single linked list
        first = null;
        size = 0;
    }
    public static class Node { //Inner Node Class
        int data; //Number within the node
        Node next; //Pointer to next node

        public Node(int data) {
            this.data = data;
        }

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }


    static class LinkedListIterator implements ListIteratorClass {
        private Node current;
        private Node previous;
        private boolean isAfterNext;

        public LinkedListIterator() {
            current = null;
            previous = null;
            isAfterNext = false;

        }

        @Override
        public boolean hasNext() {
            return current.next != null;
        }

        @Override
        public int next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            previous = current;
            //isAfterNext = true;
            current = current.next;
            return current.data;
        }

        public void remove() {
            if (!isAfterNext) {
                throw new IllegalStateException();
            }
            if (current == first) {
                removeFirst();
            } else {
                previous.next = current.next;
            }
            current = previous;
            isAfterNext = false;
        }

        public void add(int answer){
            if (current == null) {
                addFirst(answer);
                current = first;
            }else{
                current = new Node(answer, current.next);
            }
            isAfterNext = false;
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
                while (temp.next != null) {
                    temp = temp.next;
                }
                temp.next = newNode;
            }
            size++;
        }

        public void removeFirst() {
            first.data = 0;
            first = first.next;
            size--;
        }

        public static void removeLast(){
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

        public static void getLast(){
            if(first == null){return;}
            Node temp  = first;
            while(temp.next != null){
                temp = temp.next;
            }
            JOptionPane.showMessageDialog(null, "The last element of the list is " + temp.data);
        }

        public static void getFirst4(){
            Node temp = first;
            int i = 0;
            while(i < 4 && temp != null){
                System.out.print("\nNode: " + (i+1) + ": " + temp.data);
                temp = temp.next;
                i++;
            }
            if(i < 4){
                JOptionPane.showMessageDialog(null, "This list does not contain 4 nodes, only: " + i);
            }
        }
    }



    public static void main(String[] args) {
        LinkedListDemo NumList = new LinkedListDemo();
        LinkedListDemo.LinkedListIterator iter = new LinkedListIterator();
        JOptionPane.showMessageDialog(null, "hello");
        iter.addFirst(67);
        iter.addFirst(72);
        iter.addFirst(55);
        iter.addFirst(78);
        iter.addFirst(213);
        iter.addLast(41);
        iter.removeLast();
        iter.getFirst4();
        iter.getLast();
        System.out.println("\n" + size);
    }
}