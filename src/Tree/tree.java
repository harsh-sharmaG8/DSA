package Tree;

public class tree {
        static class Node {
            int data;
            Node left;
            Node right;

            Node(int data) {
                this.data = data;
            }
        }

        public static class Main {
            public static void main(String[] args) {

                // Create nodes
                Node root = new Node(1);
                root.left = new Node(2);
                root.right = new Node(3);

                root.left.left = new Node(4);
                root.left.right = new Node(5);

                root.right.left = new Node(6);
                root.right.right = new Node(7);

        /*
                1
              /   \
             2     3
            / \   / \
           4   5 6   7
        */

                System.out.println(root.data); // 1
            }
        }
}
