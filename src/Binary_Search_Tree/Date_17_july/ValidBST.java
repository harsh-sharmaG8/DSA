package Binary_Search_Tree.Date_17_july;

import Tree.Date_22_june.TreeNode;

public class ValidBST {
    public boolean isValidBST(TreeNode root) {
        return ValidBST(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }
    public boolean ValidBST(TreeNode node, long min, long max){
        if(node==null){
            return true;
        }
        if(node.val<=min || node.val>=max){
            return false;
        }
        return ValidBST(node.left,min,node.val) && ValidBST(node.right,node.val,max);
    }
}
