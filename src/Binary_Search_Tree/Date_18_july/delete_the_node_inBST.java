package Binary_Search_Tree.Date_18_july;

import Tree.Date_22_june.TreeNode;

public class delete_the_node_inBST {
    public TreeNode deleteNode(TreeNode root, int key) {
        if (root == null) {
            return null;
        }
        if (key < root.val) {
            root.left = deleteNode(root.left, key);
        } else if (key > root.val) {
            root.right = deleteNode(root.right, key);
        } else {
            //key=root.val
            //leafNode
            if (root.left == null && root.right == null) {
                return null;
            }
            //Sigle Child
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            } else {
                //2child Case
                TreeNode node = findPredecessor(root.left);
                //Shift the node
                root.val = node.val;
                //delete the node.val
                root.left = deleteNode(root.left, node.val);
            }
        }
        return root;
    }
    public TreeNode findPredecessor(TreeNode node){
        while(node.right!=null){
            node=node.right;
        }
        return node;
    }
}
