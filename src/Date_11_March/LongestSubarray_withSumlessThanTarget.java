package Date_11_March;

public class LongestSubarray_withSumlessThanTarget {
    public static int Longest_size(int[] arr, int target) {
        int sum = 0;
        int l = 0;
        int maxsize = 0;
        for (int r = 0; r < arr.length; r++) {
            sum += arr[r];
            while (sum > target) {
                sum -= arr[l];
                l++;
            }
            maxsize = Math.max(maxsize, r - l + 1);
        }
        return maxsize;
    }

    public static void main(String[] args) {
        int[] arr = {4,2,1,7,8,1,2,8};
        System.out.println(Longest_size(arr, 8));
    }
}