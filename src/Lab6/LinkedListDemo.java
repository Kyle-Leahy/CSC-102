package Lab6;
import javax.swing.*;
import java.util.ListIterator;
import java.util.NoSuchElementException;

public class LinkedListDemo {

    private Node first; //First node in the list (head)
    private int size; //Size of the linked list

    public LinkedListDemo() { //Constructor for the single linked list
        first = null;
        size = 0;

    }

    static class Node { //Inner Node Class
        public Object data; //Number within the node
        public Node next; //Pointer to next node

        public Node(int data) {
            this.data = data;
            this.next = null;
        }

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

    public ListIterator listIterator() {

        return new LinkedListIterator();
    }

    class LinkedListIterator implements ListIterator {
        private Node current;
        private Node previous;
        private boolean isAfterNext;

        public LinkedListIterator() {
            current = null;
            previous = null;
            isAfterNext = false;
        }

        public boolean hasNext() {
            if (current == null) {
                return first != null;
            } else {
                return current.next != null;
            }
        }

        public Object next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            previous = current;
            isAfterNext = true;
            if (current == null) {
                current = first;
            } else {
                current = current.next;
            }
            return current.data;
        }

        @Override
        public boolean hasPrevious() {
            return false;
        }

        @Override
        public Object previous() {
            return null;
        }

        @Override
        public int nextIndex() {
            return 0;
        }

        @Override
        public int previousIndex() {
            return 0;
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

        @Override
        public void set(Object o) {

        }

        @Override
        public void add(Object o) {

        }

        public void add(int answer){
            if (current == null) {
                addFirst(answer);
                current = first;
            }else{
                Node newNode = new Node(answer, current.next);
                current = newNode;
            }
            isAfterNext = false;
        }
    }

    public void addFirst(int answer) {
        Node newNode = new Node(answer, first);
        newNode.data = answer;
        newNode.next = first;
        first = newNode;
        size++;
    }

    public void addLast(int answer) {
        Node newNode = new Node(answer, null);
        if (size == 0) {
            first = newNode;
        } else if (size >= 1) {
            first.next = newNode;
        }
        size++;
    }

    public void removeFirst() {
        first.data = null;
        first = first.next;
        size--;
    }

    public void removeLast(){
    //Iterate to second to last, set next pointer as null.
        ListIterator listIterator = listIterator();
        while (listIterator.hasNext()) {
            if (listIterator.next() == null) {
                listIterator.remove();
            }
        }
        size--;
    }

    public void getLast(){
        Object previous = null;
        while(listIterator().hasNext()) {
            if (listIterator().next() == null) {
                previous = listIterator().previous();
            }
        }
        System.out.println(previous);
    }

    public void getFirst4(){
        Object iter = null;
        for(int i = 0; i < 4; i++){
            if(listIterator().hasNext()) {
                System.out.println(listIterator().next());
            }
        }
    }

    public static void main(String[] args) {
        LinkedListDemo NumList = new LinkedListDemo();
        JOptionPane.showInputDialog(null, "");
        NumList.addFirst(67);
        NumList.addFirst(72);
        NumList.addFirst(55);
        NumList.addFirst(78);
        NumList.addFirst(213);
        NumList.addLast(41);
        NumList.removeLast();
        NumList.getFirst4();
        NumList.getLast();
        System.out.println(NumList.size);
    }
}