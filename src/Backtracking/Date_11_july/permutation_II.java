package Backtracking.Date_11_july;

import java.util.*;

public class permutation_II {
    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        boolean[] used = new boolean[nums.length];
        helper(list , temp , nums , used);
        return list;
    }

    public void helper(List<List<Integer>> list , List<Integer> temp , int[] nums , boolean[] used ){
        if(temp.size() == nums.length){
            list.add(new ArrayList<Integer>(temp));
            return;
        }

        for(int i = 0; i< nums.length ; i++){
            if(!used[i]) {
                continue;
            }
            if(i>0 && nums[i] == nums[i-1] && !used[i-1]){
                    continue;
                }
                temp.add(nums[i]);
                used[i] = true;
                helper(list , temp , nums , used );
                temp.remove(temp.size()-1);
                used[i] = false;
            }
        }
    }
