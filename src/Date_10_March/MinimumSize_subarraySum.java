package Date_10_March;

public class MinimumSize_subarraySum {
    public static int minimum_size(int[] arr, int target) {
        int sum = 0;
        int l = 0;
        int minsize = Integer.MAX_VALUE;
        for (int r = 0; r < arr.length; r++) {
            sum += arr[r];
            while (sum >= target) {
                minsize = Math.min(minsize, r - l + 1);
                sum -= arr[l];
                l++;
            }
        }
        return minsize;
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 1, 2, 4, 3};
        System.out.println(minimum_size(arr, 7));
    }
}

