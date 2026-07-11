package Backtracking.Date_11_july;

import java.util.*;

public class Subsets {
    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> resultSet = new ArrayList<>();
        backtrack(resultSet, new ArrayList<>(), nums, 0);
        return resultSet;
    }

    public static void backtrack(List<List<Integer>> resulSet, List<Integer> tempset, int[] nums, int start) {
        resulSet.add(new ArrayList<>(tempset));
        for (int i = start; i < nums.length; i++) {
            tempset.add(nums[i]);
            backtrack(resulSet, tempset, nums, i + 1);
            tempset.remove(tempset.size() - 1);
        }
    }

    public static void main(String[] args) {
        int[] nums={1,2,3,4};
        System.out.println(subsets(nums));
    }

}


//CALL backtrack(start=0), tempSet=[]
//        │
//        ├─ SAVE: resultSets = [ [] ]                         ← saved on entry, tempSet is []
//│
//        ├─ i=0: tempSet.add(1) → tempSet=[1]
//        │  │
//        │  └─ CALL backtrack(start=1), tempSet=[1]
//        │     │
//        │     ├─ SAVE: resultSets = [ [], [1] ]
//        │     │
//        │     ├─ i=1: tempSet.add(2) → tempSet=[1,2]
//        │     │  │
//        │     │  └─ CALL backtrack(start=2), tempSet=[1,2]
//        │     │     │
//        │     │     ├─ SAVE: resultSets = [ [], [1], [1,2] ]
//        │     │     │
//        │     │     ├─ i=2: tempSet.add(3) → tempSet=[1,2,3]
//        │     │     │  │
//        │     │     │  └─ CALL backtrack(start=3), tempSet=[1,2,3]
//        │     │     │     │
//        │     │     │     ├─ SAVE: resultSets = [ [], [1], [1,2], [1,2,3] ]
//        │     │     │     └─ for loop: i starts at 3, but nums.length=3 → loop doesn't run
//        │     │     │        RETURN (nothing to undo here, we return straight up)
//│     │     │
//        │     │     │  tempSet.remove(last) → tempSet=[1,2]     ← BACKTRACK (undo the "3")
//│     │     │
//        │     │     └─ i=3: loop ends (i < nums.length fails)
//│     │        RETURN
//│     │
//        │     │  tempSet.remove(last) → tempSet=[1]              ← BACKTRACK (undo the "2")
//│     │
//        │     ├─ i=2: tempSet.add(3) → tempSet=[1,3]
//        │     │  │
//        │     │  └─ CALL backtrack(start=3), tempSet=[1,3]
//        │     │     │
//        │     │     ├─ SAVE: resultSets = [ [], [1], [1,2], [1,2,3], [1,3] ]
//        │     │     └─ for loop: i=3, doesn't run
//        │     │        RETURN
//│     │
//        │     │  tempSet.remove(last) → tempSet=[1]               ← BACKTRACK (undo the "3")
//│     │
//        │     └─ i=3: loop ends
//│        RETURN
//│
//        │  tempSet.remove(last) → tempSet=[]                       ← BACKTRACK (undo the "1")
//│
//        ├─ i=1: tempSet.add(2) → tempSet=[2]
//        │  │
//        │  └─ CALL backtrack(start=2), tempSet=[2]
//        │     │
//        │     ├─ SAVE: resultSets = [ [], [1], [1,2], [1,2,3], [1,3], [2] ]
//        │     │
//        │     ├─ i=2: tempSet.add(3) → tempSet=[2,3]
//        │     │  │
//        │     │  └─ CALL backtrack(start=3), tempSet=[2,3]
//        │     │     │
//        │     │     ├─ SAVE: resultSets = [ [], [1], [1,2], [1,2,3], [1,3], [2], [2,3] ]
//        │     │     └─ for loop: i=3, doesn't run
//        │     │        RETURN
//│     │
//        │     │  tempSet.remove(last) → tempSet=[2]                ← BACKTRACK (undo the "3")
//│     │
//        │     └─ i=3: loop ends
//│        RETURN
//│
//        │  tempSet.remove(last) → tempSet=[]                        ← BACKTRACK (undo the "2")
//│
//        ├─ i=2: tempSet.add(3) → tempSet=[3]
//        │  │
//        │  └─ CALL backtrack(start=3), tempSet=[3]
//        │     │
//        │     ├─ SAVE: resultSets = [ [], [1], [1,2], [1,2,3], [1,3], [2], [2,3], [3] ]
//        │     └─ for loop: i=3, doesn't run
//        │        RETURN
//│
//        │  tempSet.remove(last) → tempSet=[]                         ← BACKTRACK (undo the "3")
//│
//        └─ i=3: loop ends
//RETURN (top level done)