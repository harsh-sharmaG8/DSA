package Array.Date_8_july;

public class Longest_mountain_array {
    public static int longestMountain(int[] arr) {
        int n = arr.length;
        int maxlength = 0;
        int i = 1;
        while (i < n - 1) {
            if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
                int left = i - 1;
                int right = i + 1;
                while (left > 0 && arr[left] > arr[left - 1]) left--;
                while (right < n - 1 && arr[right] > arr[right + 1]) right++;
                maxlength = Math.max(maxlength, right - left + 1);
                i = right;
            } else {
                i++;
            }
        }
        return maxlength;
    }

    public static void main(String[] args) {
        int[] arr = {2, 1, 4, 7, 3, 2, 5};
        System.out.println(longestMountain(arr));
    }
}
