package Array.Date_14_june;

import java.util.HashMap;

public class Contins_Duplicate217 {
    public static boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> map =new HashMap<>();
        for(int i =0; i<nums.length; i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i],i);
            }else{
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args){
        int[] arr={1,2,3,1};
        System.out.println(containsDuplicate(arr));
    }
}
