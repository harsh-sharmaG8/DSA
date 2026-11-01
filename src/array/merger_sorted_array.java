package array;

import java.util.Arrays;

public class merger_sorted_array {
    public static long[] merge(int[] nums1, int m, int[] nums2, int n) {
        int i=m-1;
        int j=n-1;
        int k= m+n-1;
        while(j>=0){
            if( i>=0 && nums1[i] > nums2[j]){
                nums1[k--]=nums1[i--];
            }
            else{
                nums1[k--]=nums2[j--];
            }
        }

        return null;
    }

    public static void main(String[] args) {
        int[] arr1={1,2,3,0,0,0};
        int[] arr2={3,4,5};
        merge(arr1,3,arr2,3);
        System.out.println(Arrays.toString(arr1));
    }
}
