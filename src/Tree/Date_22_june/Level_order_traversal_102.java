package Tree.Date_22_june;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Level_order_traversal_102 {
    public static List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans= new ArrayList<>();
        Queue<TreeNode> q= new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            int size= q.size();
            List<Integer> level= new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode Node= q.poll();
                level.add(Node.val);
                if(Node.left!=null){
                    q.offer(Node.left);
                }
                if(Node.right!=null){
                    q.offer(Node.right);
                }

            }
            ans.add(level);
        }
        return ans;
    }

    public static void main(String[] args) {
        // Build this tree:
        //        3
        //       / \
        //      9   20
        //          / \
        //         15  7

        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        System.out.println(levelOrder(root));
    }
}
