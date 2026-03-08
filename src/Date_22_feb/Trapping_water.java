package Date_22_feb;

public class Trapping_water {
    public static int trap(int[] arr) {
        int l = 0, r = arr.length - 1;
        int lmax = Integer.MIN_VALUE;
        int rmax = Integer.MIN_VALUE, ans = 0;
        while (l < r) {
            lmax = Math.max(lmax, arr[l]);
            rmax = Math.max(rmax, arr[r]);
            ans += (lmax < rmax) ? lmax - arr[l++] : rmax - arr[r--];
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {4, 2, 0, 3, 2, 5};
        System.out.println(trap(arr));
    }
}

