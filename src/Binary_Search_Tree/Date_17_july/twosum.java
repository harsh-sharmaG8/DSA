package Binary_Search_Tree.Date_17_july;

import Tree.Date_22_june.TreeNode;

import java.util.HashSet;

public class twosum {
    HashSet<Integer> set = new HashSet<>();
    public boolean findTarget(TreeNode root, int k) {
        if(root== null){
            return false;
        }
        if(set.contains(k-root.val)) return true;
        set.add(root.val);
        return findTarget(root.left,k) || findTarget(root.right,k);

    }
}
