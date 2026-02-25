package array;
//
//    public int[] intersection(int[] nums1, int[] nums2) {
//        ArrayList<Integer> array = new ArrayList<>();
//        for(int i=0; i<nums1.length;i++){
//            for(int j=0; j<nums2.length; j++){
//                if(nums1[i]==nums2[j]){
//                    if(!array.contains(nums1[i])){
//                        array.add(nums1[i]);
//                    }
//                }
//            }
//        }
//        int[] result = new int[array.size()];
//        for(int i = 0; i < array.size(); i++) {
//            result[i] = array.get(i);
//        }
//        return result;
//
//    }

import java.util.ArrayList;

//BY TWO POINTER
public class Intersection_of_Arrays {
    public static ArrayList<Integer> intersection(int[] arr1, int[] arr2) {
        ArrayList<Integer> array = new ArrayList<>();
        int i = 0;
        int j = 0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] == arr2[j]) {
                array.add(arr1[i]);
                i++;
                j++;
            } else if (arr1[i] < arr2[j]) {
                i++;
            } else {
                j++;
            }

        }
        return array;
    }

    public static void main(String[] args){
        int[] a = {1,2,2,3,4};
        int[] b = {2,2,3,5};

        System.out.println(intersection(a,b));
    }
}