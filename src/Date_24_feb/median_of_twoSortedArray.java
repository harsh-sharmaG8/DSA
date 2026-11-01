package Date_24_feb;

import java.util.Arrays;

public class median_of_twoSortedArray {
    //    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
//        int n = nums1.length;
//        int m = nums2.length;
//
//        int[] merged = new int[n + m];
//        int k = 0;
//        for (int i = 0; i < n; i++) {
//            merged[k++] = nums1[i];
//        }
//        for (int i = 0; i < m; i++) {
//            merged[k++] = nums2[i];
//        }
//
//        Arrays.sort(merged);
//        int total = merged.length;
//
//        if (total % 2 == 1) {
//            return (double) merged[total / 2];
//        } else {
//            int middle1 = merged[total / 2 - 1];
//            int middle2 = merged[total / 2];
//            return ((double) middle1 + (double) middle2) / 2.0;
//        }
//    }
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        if (n > m) {
            return findMedianSortedArrays(nums2, nums1);
        }
        int low = 0;
        int high = n;
        while (low <= high) {
            int partitionX = (low + high) / 2;
            int partitionY = (n + m + 1) / 2 - partitionX;
            int l1 = (partitionX == 0) ? Integer.MIN_VALUE : nums1[partitionX - 1];
            int r1 = (partitionX == n) ? Integer.MAX_VALUE : nums1[partitionX];
            int l2=(partitionY==0)? Integer.MIN_VALUE: nums2[partitionY-1];
            int r2 = (partitionY == m) ? Integer.MAX_VALUE : nums2[partitionY];
            if (l1 <= r2 && l2 <= r1) {
                if ((n + m) % 2 == 1) {
                    return Math.max(l1, l2);
                } else if ((n + m) % 2 == 0) {
                    return (Math.max(l1, l2) + Math.min(r1, r2)) / 2.0;
                }
            } else if (l1 > r2) {
                high = partitionX - 1;
            } else {
                low = partitionX + 1;
            }
        }
        return 0.0;
    }

    public static void main(String[] args) {
        int[] nums1={1,3,8,9};
        int[] nums2={2,5,6,11,12};
        System.out.println(findMedianSortedArrays(nums1, nums2));
    }
}