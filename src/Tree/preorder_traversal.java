package Tree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
}

public class preorder_traversal {
    public static List<Integer> preorderTraversal(TreeNode root){
        List<Integer> ans= new ArrayList<>();
        preorder(root,ans);
        return ans;
    }
    public static void preorder(TreeNode root, List<Integer> ans){
        if(root==null){
            return;
        }
        ans.add(root.val);
        preorder(root.left, ans);
        preorder(root.right, ans);

    }
    public static void main(String[] args) {

        // Build this tree:
        //        1
        //       / \
        //      2   3
        //     / \
        //    4   5

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        System.out.println(preorderTraversal(root));
        // Output: [1, 2, 4, 5, 3]
    }
}

