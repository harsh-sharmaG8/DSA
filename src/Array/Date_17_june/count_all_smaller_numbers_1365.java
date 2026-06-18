package Array.Date_17_june;

import java.util.Arrays;

/// using frequency array trick with o(n) time and constant space complexity
public class count_all_smaller_numbers_1365 {
    public static int[] smallerNumbersThanCurrent(int[] nums){
        int[] freq =new int[101];
        for(int num : nums){
            freq[num]++;
        }
        for(int i=1; i<freq.length; i++){
            freq[i] += freq[i-1];
        }
        int[] arr = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]==0){
                arr[i]=0;
            }else {
                arr[i] = freq[nums[i] - 1];
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] temp= {8,1,2,2,3};
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(temp)));
    }
}

///  with n^2 complexity
//        int[] arr = new int[nums.length];
//        for(int i=0; i<nums.length; i++){
//            int count=0;
//            for(int j=0; j<nums.length; j++){
//                if(nums[i]>nums[j])
//                    count++;
//            }
//            arr[i]=count;
//        }
//        return arr;
//    }
//}
