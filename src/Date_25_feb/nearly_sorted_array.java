package Date_25_feb;

public class nearly_sorted_array {
    public static int nearly_sorted(int[] arr, int target) {
        int s = 0;
        int n = arr.length;
        int e = n - 1;
        int ans = -1;
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (mid-1>0 && arr[mid - 1] == target) {
                return mid - 1;
            } else if (mid+1<n && arr[mid + 1] == target) {
                return mid + 1;
            } else if (arr[mid] < target) {
                s = mid+2;
            } else {
                e = mid+2;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {20, 10, 40, 30, 50, 70, 60};
        System.out.println(nearly_sorted(arr, 60));
    }
}
