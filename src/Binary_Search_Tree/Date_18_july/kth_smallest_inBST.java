package Binary_Search_Tree.Date_18_july;

import Tree.Date_22_june.TreeNode;

public class kth_smallest_inBST {
    int pos=0;
    public int kthSmallest(TreeNode root, int k) {
        TreeNode node= inorder(root,k);
        if(node==null){
            return -1;
        }
        return node.val;
    }
    public TreeNode inorder(TreeNode root, int k){
        if(root==null){
            return root;
        }
        TreeNode left= inorder(root.left,k);
        if(left!=null){
            return left;
        }
        pos++;
        if(pos==k){
            return root;
        }
        return inorder(root.right,k);
    }
}
