package Tree.Date_22_june;

import java.util.LinkedList;
import java.util.Queue;

public class  minimum_depthOftree {
    public static int mindepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);

        int depth = 1;

        while (!q.isEmpty()) {
            int size = q.size();

            for (int i = 0; i < size; i++) {
                TreeNode node = q.poll();

                if(node.left==null && node.right==null){
                    return depth;
                }

                if (node.left != null) {
                    q.offer(node.left);
                }

                if (node.right != null) {
                    q.offer(node.right);
                }
            }

            depth++;
        }

        return depth;
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

        System.out.println(mindepth(root));
    }
}

