package Tree.Date_15_july;

public class path_sum {
    class Solution {
        public boolean hasPathSum(Same_Tree.TreeNode root, int targetSum) {
            if (root == null) return false;

            if (root.left == null && root.right == null) {
                return targetSum - root.val == 0;
            }

            targetSum -= root.val;

            return hasPathSum(root.left, targetSum) || hasPathSum(root.right, targetSum);
        }
    }
}
