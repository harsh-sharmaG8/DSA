package Backtracking.Date_11_july;

import java.util.ArrayList;
import java.util.List;

public class permutation3 {
    public static List<List<String >>  permute(int N) {
        List<List<String>> resultSet = new ArrayList<>();
        List<String> tempSet = new ArrayList<>();
        String[] chars ={"A", "B", "C", "D"};
        backtrack(resultSet, tempSet, chars, N);
        return resultSet;
    }
    public static void backtrack(List<List<String>> resultSet, List<String> tempset, String[] chars, int N){
        if(tempset.size()==N){
            resultSet.add(new ArrayList<>(tempset));
            return;

        }
        for(int i=0;i<chars.length;i++){
            if (tempset.contains(chars[i])) {
                continue;
            }

            if (!tempset.isEmpty() &&
                    tempset.get(tempset.size() - 1).equals(chars[i])) {
                continue;
            }
            tempset.add(chars[i]);
            backtrack(resultSet, tempset, chars, N);
            tempset.remove(tempset.size()-1);
        }
    }

    public static void main(String[] args) {
        System.out.println(permute(2));

    }

}
