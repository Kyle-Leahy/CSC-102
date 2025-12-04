package Lab7;

public class TreeSearchingLab {
    public static class BinaryTree { //Binary Search Tree Class
        private static Node root;
        public BinaryTree() {root = null;}
        public BinaryTree(Comparable rootData, BinaryTree left, BinaryTree right) {
            root = new Node<>(rootData);
            root.data = rootData;
            root.left = left.root;
            root.right = right.root;
        }

        public static class Node<T extends Comparable<T>> implements Comparable<Node<T>>{ //Inner Node Class
            public T data;
            public Node<T> left;
            public Node<T> right;
            public Node(T data) {this.data = null;}

            public Node<T> add(T data) {
                int compare = data.compareTo(this.data);
                if(compare < 0){
                    if(this.left == null){this.left = new Node<>(data);}
                    else {left = left.add(data);}
                } else if(compare > 0){
                    if(this.right == null){this.right = new Node<>(data);}
                    else{right = right.add(data);}
                }
                return this;
            }

            public Node<T> remove(T data){
                int compare = data.compareTo(this.data);
                if(compare < 0){
                    if(this.left != null){this.left = left.remove(data);}
                }
                else if(compare > 0){
                    if(this.right != null){this.right = right.remove(data);}
                    else {
                        if (this.left == null && this.right == null){return null;}
                    }
                }
            }
            public boolean isPresent(){ //Find
                return data != null;
            }
            public String print() {
                return root.data.toString();
            }

            @Override
            public int compareTo(Node<T> other) {
                return this.data.compareTo(other.data);
            }
            @Override
            public String toString() {
                return String.valueOf(data);
            }
        }
    }
    public static void  main(String[] args) throws Exception {
        BinaryTree tree = new BinaryTree();
    }
}