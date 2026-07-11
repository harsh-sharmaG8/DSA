package Backtracking.Date_11_july;

import com.sun.security.jgss.GSSUtil;

import java.util.*;

public class Permutation {
    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> resultSet = new ArrayList<>();
        backtrack(resultSet, new ArrayList<>(),nums);
        return resultSet;
    }
    public static void backtrack(List<List<Integer>> resultSet, List<Integer> tempset, int[] nums){
        if(tempset.size()==nums.length){
            resultSet.add(new ArrayList<>(tempset));

        }
        for(int num: nums){
            if(tempset.contains(num)){
                continue;
            }
            tempset.add(num);
            backtrack(resultSet, tempset, nums);
            tempset.remove(tempset.size()-1);
        }
    }

    public static void main(String[] args) {
        int[] nums={1,2,3};
        System.out.println(permute(nums));
    }
}
