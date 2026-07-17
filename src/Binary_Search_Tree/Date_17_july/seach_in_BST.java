package Binary_Search_Tree.Date_17_july;

import Tree.Date_22_june.TreeNode;
public class seach_in_BST {
    public TreeNode searchBST(TreeNode root, int val) {
        if(root==null){
            return null;
        }
        if(root.val==val){
            return root;
        }
        else if(root.val>val){
            return searchBST(root.left,val);
        }
        else{
            return searchBST(root.right,val);
        }
    }
}
