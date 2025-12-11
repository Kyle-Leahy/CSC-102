package Lab7;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * A Binary Search Tree that stores integers from a number file.
 * Methods for adding, removing, finding and printing integers from the Tree with
 * exceptions handling for invalid operation usage.
 * @author Bjork/Kyle Leahy
 * @version 1.2 kinda?
 */
public class BinaryTreeSearcher {

    /**
     * Reference to the Root Node of the Tree
     */
    private Node root;

    /**
     * Constructor of a null root tree
     */
    public BinaryTreeSearcher() {
        root = null;
    }

    /**
     * Inserts a value into a new Node in the Tree
     *
     * @param value New integer to insert
     * @throws TreeException if inserting a duplicate
     */
    public void add(int value) throws TreeException {
        if (root == null) {
            root = new Node(value);
        } else {
            root = root.add(value);
        }
    }

    /**
     * Removes a given value/Node in the Tree
     *
     * @param value Integer to remove
     * @throws TreeException when removing from empty tree or value not present
     */
    public void remove(int value) throws TreeException {
        if (root == null) {
            throw new TreeException("Cannot remove from an empty tree.");
        }
        if (!find(value)) {
            throw new TreeException("Value " + value + " not found.");
        } else {
            root = root.remove(value);
        }
    }

    /**
     * Checks if the tree contains a given value.
     *
     * @param value integer to search for
     * @return A boolean true or false depending on if the value exists in the Tree.
     */
    public boolean find(int value) {
        return root != null && root.find(value);
    }

    /**
     * Prints all values in sorted order traversal.
     */
    public void print() {
        if (root == null) {
            System.out.println("This tree is empty.");
        } else {
            root.print();
        }
    }

    /**
     * Node Class of the Binary Search Tree with references to left & right nodes.
     *
     * @author Bjork/Kyle Leahy
     */
    private static class Node {
        int data;
        Node left;
        Node right;

        /**
         * Node Constructor pointing to a data reference.
         */
        public Node(int data) {
            this.data = data;
        }

        /**
         * Insert while recursively moving through tree.
         */
        public Node add(int value) throws TreeException {
            if (value == this.data) {
                throw new TreeException("Duplicate values not allowed.");
            }
            if (value < this.data) {
                if (left == null) left = new Node(value);
                else left = left.add(value);
            } else {
                if (right == null) right = new Node(value);
                else right = right.add(value);
            }
            return this;
        }

        /**
         * Remove while moving recursively through tree.
         */
        public Node remove(int value) {
            if (value < this.data) {
                if (left != null) {
                    left = left.remove(value);
                }
            } else if (value > this.data) {
                if (right != null) {
                    right = right.remove(value);
                }
            } else {
                // This logic represents a leaf.
                if (left == null && right == null) {
                    return null;
                }

                // This logic represents one child
                if (left == null) return right;
                if (right == null) return left;

                // For two children we get the inorder newChild
                Node newChild = right;
                while (newChild.left != null) {
                    newChild = newChild.left;
                }
                this.data = newChild.data; // Place data in new node
                right = right.remove(newChild.data); // Remove newChild holder node
            }
            return this;
        }

        /**
         * Search through Tree's Nodes recursively
         */
        public boolean find(int value) {
            if (value == this.data) return true;
            if (value < this.data) return left != null && left.find(value);
            return right != null && right.find(value);
        }

        /**
         * Print Tree in recursive sorted order.
         */
        public void print() {
            if (left != null) {
                left.print();
            }
            System.out.print(data + ", "); // Spacer for the values to be read easier.
            if (right != null) {
                right.print();
            }
        }
    }

    /**
     * This main method calls upon all the things required for satisfying Lab 7.
     */
    public static void main(String[] args) {
        BinaryTreeSearcher tree = new BinaryTreeSearcher();
        try {
            Scanner input = new Scanner(new File("numbers.txt"));
            while (input.hasNextInt()) {
                int value = input.nextInt();
                try {tree.add(value);}
                catch (TreeException e) {
                    System.out.println("Error inserting " + value + ": " + e.getMessage());
                }
            }
            input.close();
        } catch (FileNotFoundException e) {System.out.println("Input file 'numbers.txt' not found.");}

        System.out.println("\nTree contents in sorted order:");
        tree.print();
        System.out.println("\nSearching for the value 40.");
        System.out.println("Value in the Tree? " + tree.find(40));

        System.out.println("\nSearching for the value 999.");
        System.out.println("Value in the Tree? " + tree.find(999));

        try {
            System.out.println("\nRemoving 40");
            tree.remove(40);
            System.out.println("Tree after removing 40:");
            tree.print();
            System.out.println("\nAttempting to remove 999...");
            tree.remove(999); // Should throw a new exception message.
        } catch (TreeException e) {System.out.println("Error during removal: " + e.getMessage());}
        System.out.println("\nProgram complete. Thank you for this semester Prof. Scheffold :)");
    }
}