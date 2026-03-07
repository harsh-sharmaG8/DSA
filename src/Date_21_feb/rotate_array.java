package Date_21_feb;

import javax.swing.*;

public class rotate_array {
    public static void rotate(int[] nums, int k) {
        int n = nums.length;
        k= k%n;
        reverse(nums,0, n-1);
        reverse(nums,0,k-1);
        reverse(nums,k, n-1);
        for(int i : nums){
            System.out.println(i);
        }
    }
    public static void reverse(int[] nums, int s, int e){
        while(e>s){
            int temp= nums[s];
            nums[s]= nums[e];
            nums[e]= temp;
            s++;
            e--;
        }
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        rotate(nums, 3);
    }
}
