package Array.Date_8_july;

import java.util.*;
/// hashset and using sliding window
public class Contins_duplicate_II {
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                return true;
            } else {
                set.add(nums[i]);
            }
            if (set.size() > k) {
                set.remove(nums[i - k]);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1};
        System.out.println(containsNearbyDuplicate(arr, 3));
    }
}


/// using hashmap
//        Map<Integer,Integer> seen = new HashMap<>();
//        for(int i=0; i<nums.length; i++){
//            if(seen.containsKey(nums[i]) && Math.abs(i-seen.get(nums[i]))<=k){
//                return true;
//            }
//            else{
//                seen.put(nums[i],i);
//            }
//        }
//        return false;
//    }
