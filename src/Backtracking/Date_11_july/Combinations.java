package Backtracking.Date_11_july;

import java.util.*;

public class Combinations {
    public static List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> resultSet = new ArrayList<>();
        List<Integer> tempset = new ArrayList<>();

        backtrack(resultSet, tempset, 1, n, k);
        return resultSet;
    }

    private static void backtrack(List<List<Integer>> resultSet, List<Integer> tempset,int start, int n, int k) {
        if (tempset.size() == k) {
            resultSet.add(new ArrayList<>(tempset));
            return;
        }

        for (int num = start; num <= n; num++) {
            tempset.add(num);
            backtrack(resultSet, tempset, num+1, n, k);
            tempset.remove(tempset.size() - 1);
        }
    }

    public static void main(String[] args) {
        System.out.println(combine(4,2));
    }
}
