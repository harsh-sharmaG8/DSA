package Backtracking.Date_11_july;

import java.util.*;

public class combinations_II {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> resultSet = new ArrayList<>();
        List<Integer> tempSet = new ArrayList<>();
        backtrack(resultSet, tempSet, 0, candidates, target);
        return resultSet;
    }

    private void backtrack(List<List<Integer>> resultSet,
                           List<Integer> tempSet,
                           int start,
                           int[] candidates,
                           int target) {

        if (target == 0) {
            resultSet.add(new ArrayList<>(tempSet));
            return;
        }
        for (int i = start; i < candidates.length; i++) {
            if (i > start && candidates[i] == candidates[i - 1])
                continue;

            if (candidates[i] > target)
                break;

            tempSet.add(candidates[i]);
            backtrack(resultSet,
                    tempSet,
                    i + 1,
                    candidates,
                    target - candidates[i]);

            tempSet.remove(tempSet.size() - 1);
        }
    }
}

