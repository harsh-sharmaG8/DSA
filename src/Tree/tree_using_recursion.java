package Tree;

import java.util.Scanner;

class Node{
    int data;
    Node left, right;
    Node(int data){
        this.data= data;
        }
    }
public class tree_using_recursion {
    static Scanner sc = new Scanner(System.in);
    static Node create_tree(){
        System.out.println("enter the data:");
        int data = sc.nextInt();
        if (data == -1) {
            return null;
        }
        Node root = new Node(data);

        root.left=create_tree();
        root.right=create_tree();

        return root;
    }

    static void preorder(Node root){
        if(root== null) return;

        System.out.println(root.data+"");
        preorder(root.left);
        preorder(root.right);
    }

    public static void main(String[] args) {
        Node root = create_tree();
        preorder(root);
    }
}
