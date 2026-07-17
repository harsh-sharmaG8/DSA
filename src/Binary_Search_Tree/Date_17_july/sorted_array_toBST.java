package Binary_Search_Tree.Date_17_july;

import Tree.Date_22_june.TreeNode;

public class sorted_array_toBST{
    public TreeNode sortedArrayToBST(int[] nums) {
        return build(0,nums.length-1,nums);
    }
    public TreeNode build(int left,int right, int[]nums){
        if(left > right) {
            return null;
        }
        int mid = left + (right - left) / 2;
        TreeNode node= new TreeNode(nums[mid]);
        node.left = build(left,mid-1,nums);
        node.right = build(mid+1,right,nums);
        return node;
    }
}
