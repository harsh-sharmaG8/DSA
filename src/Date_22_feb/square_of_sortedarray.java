package Date_22_feb;

import java.util.Arrays;

public class square_of_sortedarray {
    public static int[] sortedSquares(int[] nums) {
        int left = 0;
        int n = nums.length;
        int[] ans = new int[n];
        int right = n - 1;
        int pos = n - 1;
        while (left <= right) {
            if (Math.abs(nums[left]) > Math.abs(nums[right])) {
                ans[pos--] = nums[left] * nums[left];
                left++;
            } else {
                ans[pos--] = nums[right] * nums[right];
                right--;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr={-7,-3,2,3,11};
        System.out.println(Arrays.toString(sortedSquares(arr)));
    }
}
