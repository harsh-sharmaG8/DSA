package Tree;

import java.util.ArrayList;
import java.util.List;

public class inorder_traversal {
    public static List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        inorder(root, ans);
        return ans;
    }

    private static void inorder(TreeNode root, List<Integer> ans) {
        if (root == null) {
            return;
        }
        inorder(root.left, ans);  // Left
        ans.add(root.val);        // Root
        inorder(root.right, ans); // Right
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

        System.out.println(inorderTraversal(root));
    }
}
