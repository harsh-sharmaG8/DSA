package Tree.Date_24_june;

import java.util.ArrayList;
import java.util.List;

public class postorder_traversal {
    public static List<Integer> postorderTraversal(TreeNode root){
        List<Integer> ans = new ArrayList<>();
        postorder(root, ans);
        return ans;
    }
    public static void postorder(TreeNode root, List<Integer> ans){
        if(root==null) {
            return;
        }
        postorder(root.left, ans);
        postorder(root.right, ans);
        ans.add(root.val);

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

        System.out.println(postorderTraversal(root));
    }
}

