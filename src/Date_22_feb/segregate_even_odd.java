package Date_22_feb;

import java.util.Arrays;

public class segregate_even_odd {
    static void segregate(Integer[] arr) {
        Arrays.sort(arr, (a,b)->Integer.compare(a%2,b%2));
//        int lo = 0, hi = arr.length - 1;
//        while (hi >= lo) {
//            if (arr[lo] % 2 != 0) {
//                if (arr[hi] % 2 == 0) {
//                    int temp = arr[lo];
//                    arr[lo] = arr[hi];
//                    arr[hi] = temp;
//                    lo++;
//                    hi--;
//                } else {
//                    hi--;
//                }
//            } else {
//                lo++;
//            }
//        }
    }
    public static void main(String[] args) {
        Integer[] arr = {1, 2, 3, 4, 5, 6};
        segregate(arr);
        System.out.println(Arrays.toString(arr));
    }
}

