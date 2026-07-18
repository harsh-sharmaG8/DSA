package Binary_Search_Tree.Date_17_july;

import Tree.Date_22_june.TreeNode;
public class lowest_common_ancestor {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        while(root!=null){
            if(p.val<root.val && q.val<root.val){
                root= root.left;
            }
            else if(p.val>root.val && q.val>root.val){
                root= root.right;
            }
            else{
                return root;
            }
        }
        return null  ;
    }
}
