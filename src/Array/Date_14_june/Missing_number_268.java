package Array.Date_14_june;

import java.util.Arrays;

public class Missing_number_268 {
    public static int missingNumber(int[] nums) {
        int n = nums.length;
        int total_sum= (n*(n+1))/2;
        int sum = Arrays.stream(nums).sum();
        int missing_num = total_sum - sum;
        return missing_num;
    }

    public static void main(String[] args) {
        int[] arr={3,0,1};
        System.out.println(missingNumber(arr));
    }
}

// for sum of an array
//   int sum=0;
//   for(int i=o; i<arr.lrngth; i++){
//         int sum += arr[i];
//    }

// but using stream , first we have to make this array as a stream
// then only after that  we could play with that stream means sum it filter it
// or using any method but surely first make it stream
///   we can do this by using:  collections.stream();  method but collection contains objects collections
///   like arraylist set etc; and we have simple array which contains primitive "int" not the objets
///     which are Integer and int is a primitive data type so
//    we use  Arrays.stream(pas arraay here): so we use Arrays.stream(nums). then now use any chaining method