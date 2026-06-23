package Array.Date_21_June;

import java.util.*;

public class Three_sum {
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        int n = nums.length;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            int left = i + 1;
            int right = n - 1;
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if (sum == 0) {
                    ans.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    while (left < right && nums[left] == nums[left + 1]) left++;
                    while (left < right && nums[right] == nums[right - 1]) right--;
                    left++;
                    right--;
                } else if (sum < 0) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        return ans;

    }

    public static void main(String[] args) {
        int[] arr= {-1,0,1,2,-1,-4};
        System.out.println(threeSum(arr));
    }
}


/// using HashSet (better approach and above is optimal)
//    public static List<List<Integer>> threeSum(int[] nums) {
//        Set<List<Integer>> uniquetriplets= new HashSet<>();
//        List<List<Integer>> ans = new ArrayList<>();
//        for(int i=0; i<nums.length-2;i++){
//            int target = -nums[i];
//            Set<Integer> s =new HashSet<>();
//            for(int j=i+1; j<nums.length;j++){
//                int third= target- nums[j];
//                if(s.contains(third)){
//                    List<Integer> trip= Arrays.asList(nums[i],nums[j],third);
//                    Collections.sort(trip);
//                    uniquetriplets.add(trip);
//
//                }
//                s.add(nums[j]);
//            }
//        }
//
//        ans.addAll(uniquetriplets);
//        return ans;
//    }
