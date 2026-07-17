package Tree.Date_17_july;

import Tree.Date_15_july.Same_Tree;

import javax.swing.tree.TreeNode;

public class Diameter_of_BinaryTree {
    int res=0;
    public int diameterOfBinaryTree(TreeNode root) {
        dfs((Same_Tree.TreeNode) root);
        return  res;
    }
    public int dfs(Same_Tree.TreeNode root){
        if(root==null){
            return 0;
        }
        int l= dfs(root.left);
        int r= dfs(root.right);

        res=Math.max(res,l+r);

        return 1+ Math.max(l,r);
    }
}
