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


//CALL backtrack(), tempList=[]
//        │
//        ├─ number=1: contains(1)? NO → add → tempList=[1]
//        │  │
//        │  └─ CALL backtrack(), tempList=[1]
//        │     │
//        │     ├─ number=1: contains(1)? YES → SKIP (continue)
//        │
//        │     ├─ number=2: contains(2)? NO → add → tempList=[1,2]
//        │     │  │
//        │     │  └─ CALL backtrack(), tempList=[1,2]
//        │     │     │
//        │     │     ├─ number=1: contains? YES → SKIP
//        │     ├─ number=2: contains? YES → SKIP
//        │     ├─ number=3: contains? NO → add → tempList=[1,2,3]
//        │     │     │  │
//        │     │     │  └─ CALL backtrack(), tempList=[1,2,3]
//        │     │     │     size==3 → SAVE [1,2,3]              ✅ resultList=[[1,2,3]]
//        │     │     │     RETURN
//        │     │
//        │     │     │  remove(last) → tempList=[1,2]           ← BACKTRACK "3"
//        │     │     └─ loop ends, RETURN
//        │
//        │     │  remove(last) → tempList=[1]                    ← BACKTRACK "2"
//        │     │
//        │     ├─ number=3: contains(3)? NO → add → tempList=[1,3]
//        │     │  │
//        │     │  └─ CALL backtrack(), tempList=[1,3]
//        │     │     │
//        │     │     ├─ number=1: contains? YES → SKIP
//        │     ├─ number=2: contains? NO → add → tempList=[1,3,2]
//        │     │     │  │
//        │     │     │  └─ CALL backtrack(), tempList=[1,3,2]
//        │     │     │     size==3 → SAVE [1,3,2]              ✅ resultList=[[1,2,3],[1,3,2]]
//        │     │     │     RETURN
//        │     │
//        │     │     │  remove(last) → tempList=[1,3]            ← BACKTRACK "2"
//        │     │     ├─ number=3: contains? YES → SKIP
//        │     └─ loop ends, RETURN
//        │
//        │     │  remove(last) → tempList=[1]                     ← BACKTRACK "3"
//        │     └─ loop ends, RETURN
//        │
//        │  remove(last) → tempList=[]                              ← BACKTRACK "1"
//        │
//        ├─ number=2: contains(2)? NO → add → tempList=[2]
//        │  │
//        │  └─ CALL backtrack(), tempList=[2]
//        │     ├─ number=1: add → [2,1] → recurse → SAVE [2,1,3]   ✅  (after inner 1,3 steps)
//        │     ├─ number=2: SKIP
//        ├─ number=3: add → [2,3] → recurse → SAVE [2,3,1]   ✅
//        │     └─ loop ends, RETURN
//        │
//        │  remove(last) → tempList=[]
//        │
//        ├─ number=3: contains(3)? NO → add → tempList=[3]
//        │  │
//        │  └─ CALL backtrack(), tempList=[3]
//        │     ├─ number=1: add → [3,1] → recurse → SAVE [3,1,2]   ✅
//        │     ├─ number=2: add → [3,2] → recurse → SAVE [3,2,1]   ✅
//        │     ├─ number=3: SKIP
//        │     └─ loop ends, RETURN
//        │
//        │  remove(last) → tempList=[]
//        │
//        └─ loop ends. Top-level RETURN.