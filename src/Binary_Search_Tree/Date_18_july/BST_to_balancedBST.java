package Binary_Search_Tree.Date_18_july;

import Tree.Date_22_june.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class BST_to_balancedBST {
    public void inorder(List<Integer> list, TreeNode root){
        if(root==null){
            return;
        }
        inorder(list,root.left);
        list.add(root.val);
        inorder(list,root.right);
    }
    public TreeNode balanceBST(TreeNode root) {
        List<Integer> list= new ArrayList<>();
        inorder(list,root);
        return build(list,0,list.size()-1);

    }
    public TreeNode build(List<Integer> list, int start, int end){
        if(start>end){
            return null;
        }
        int mid= start +(end-start)/2;
        TreeNode node= new TreeNode(list.get(mid));
        node.left=build(list,start,mid-1);
        node.right=build(list,mid+1,end);
        return node;

    }
}
