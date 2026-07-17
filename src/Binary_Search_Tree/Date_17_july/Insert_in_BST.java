package Binary_Search_Tree.Date_17_july;

import Tree.Date_22_june.TreeNode;

public class Insert_in_BST {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        TreeNode temp= root;
        if(root==null){
            return new TreeNode(val);
        }
        if(root.val>val){
            root.left=insertIntoBST(root.left, val);
        }
        else if(root.val<val){
            root.right=insertIntoBST(root.right,val);
        }
        return root;
    }
}
