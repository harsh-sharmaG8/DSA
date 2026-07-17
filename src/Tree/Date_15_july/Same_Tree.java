package Tree.Date_15_july;

import javax.swing.tree.TreeNode;

public class Same_Tree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null && q==null){
            return true;
        }
        if(p==null || q==null){
            return false;
        }
        return (p.val==q.val && isSameTree(p.left,q.left) && isSameTree(p.right,q.right));

    }

//--------------------------------------------------------------------------------
    public static class TreeNode {
        int val;
        public TreeNode left;
        public TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

}
