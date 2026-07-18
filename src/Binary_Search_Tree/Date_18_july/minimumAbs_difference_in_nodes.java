package Binary_Search_Tree.Date_18_july;

import Tree.Date_22_june.TreeNode;  //530

public class minimumAbs_difference_in_nodes {
    int mindiff= Integer.MAX_VALUE;
    TreeNode prevNode = null;
    public int getMinimumDifference(TreeNode root) {
        inorder(root);
        return mindiff;
    }
    public void inorder(TreeNode root){
        if(root==null){
            return;
        }
        inorder(root.left);
        if(prevNode==null){
            prevNode=root;
        }
        else{
            int value= root.val- prevNode.val;
            if(value<mindiff){
                mindiff= value;
            }
            prevNode= root;
        }

    }
}
