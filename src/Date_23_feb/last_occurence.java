package Date_23_feb;

public class last_occurence {
    public static int last_occurence(int[] arr, int target) {
        int s = 0;
        int n = arr.length;
        int e = n - 1;
        int ans = -1;
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (arr[mid] == target) {
                ans = mid;
                s = mid + 1;
            } else if (arr[mid] < target) {
                s = mid + 1;
            } else {
                e = mid - 1;
            }

        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr={1,2,4,4,4,5,6};
        System.out.println(last_occurence(arr, 4));


    }
}
