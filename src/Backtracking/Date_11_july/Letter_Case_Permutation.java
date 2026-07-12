package Backtracking.Date_11_july;

import java.util.*;

public class Letter_Case_Permutation {
    public static List<String> letterCasePermutation(String s) {
        List<String> resultSet = new ArrayList<>();
        backtrack(s.toCharArray(), 0, resultSet);
        return resultSet;
    }

    public static void backtrack(char[] chars, int index, List<String> resultSet) {
        if (index == chars.length) {
            resultSet.add(new String(chars));
            return;
        }
        if (Character.isDigit(chars[index])) {
            backtrack(chars, index + 1, resultSet);
            return;
        }
        chars[index] = Character.toLowerCase(chars[index]);
        backtrack(chars, index + 1, resultSet);

        chars[index] = Character.toUpperCase(chars[index]);
        backtrack(chars, index + 1, resultSet);
    }

    public static void main(String[] args) {
        String s = "a1b2";
        System.out.println(letterCasePermutation(s));
    }
}
//------------------------------------------------------------------------------------------
//CALL backtrack(index=0), chars=['a','1','b']
//        │
//        ├─ chars[0]='a' is a LETTER
//        │
//        ├─ try lowercase: chars[0]='a' → chars=['a','1','b']
//        │  │
//        │  └─ CALL backtrack(index=1), chars=['a','1','b']
//        │     │
//        │     ├─ chars[1]='1' is a DIGIT → no choice, just recurse
//        │     │  │
//        │     │  └─ CALL backtrack(index=2), chars=['a','1','b']
//        │     │     │
//        │     │     ├─ chars[2]='b' is a LETTER
//        │     │     │
//        │     │     ├─ try lowercase: chars[2]='b' → chars=['a','1','b']
//        │     │     │  │
//        │     │     │  └─ CALL backtrack(index=3) → index==length
//        │     │     │       SAVE "a1b"                    ✅ result=["a1b"]
//        │     │     │
//        │     │     ├─ try uppercase: chars[2]='B' → chars=['a','1','B']
//        │     │     │  │
//        │     │     │  └─ CALL backtrack(index=3) → index==length
//        │     │     │       SAVE "a1B"                    ✅ result=["a1b","a1B"]
//        │     │     │
//        │     │     └─ RETURN
//        │     │
//        │     └─ RETURN
//        │
//        ├─ try uppercase: chars[0]='A' → chars=['A','1','b']
//        │  │
//        │  └─ CALL backtrack(index=1), chars=['A','1','b']
//        │     │
//        │     ├─ chars[1]='1' is a DIGIT → no choice, just recurse
//        │     │  │
//        │     │  └─ CALL backtrack(index=2), chars=['A','1','b']
//        │     │     │
//        │     │     ├─ chars[2]='b' is a LETTER
//        │     │     │
//        │     │     ├─ try lowercase: chars[2]='b' → chars=['A','1','b']
//        │     │     │  │
//        │     │     │  └─ CALL backtrack(index=3) → index==length
//        │     │     │       SAVE "A1b"                    ✅ result=["a1b","a1B","A1b"]
//        │     │     │
//        │     │     ├─ try uppercase: chars[2]='B' → chars=['A','1','B']
//        │     │     │  │
//        │     │     │  └─ CALL backtrack(index=3) → index==length
//        │     │     │       SAVE "A1B"                    ✅ result=["a1b","a1B","A1b","A1B"]
//        │     │     │
//        │     │     └─ RETURN
//        │     │
//        │     └─ RETURN
//        │
//        └─ RETURN (top level done)

//-------------------------------------------------------------------------------------------

//    public static List<String> letterCasePermutation(String s) {
//        List<String> result = new ArrayList<>();
//        result.add(s);
//
//        for (int i = 0; i < s.length(); i++) {
//            if (Character.isDigit(s.charAt(i))) continue;   // digits: nothing to do
//
//            int size = result.size();
//            for (int j = 0; j < size; j++) {
//                char[] chars = result.get(j).toCharArray();
//                chars[i] = Character.isUpperCase(chars[i])
//                        ? Character.toLowerCase(chars[i])
//                        : Character.toUpperCase(chars[i]);
//                result.add(new String(chars));   // add the flipped-case version
//            }
//        }
//        return result;
//    }
//-----------------------------------------------------------------------------------------
//    Start: result = ["a1b"]
//
//    i=0, char='a' (letter):
//    size=1
//    j=0: "a1b" → flip index 0 → "A1b"
//    result = ["a1b", "A1b"]
//
//    i=1, char='1' (digit): skip, nothing added
//    result = ["a1b", "A1b"]
//
//    i=2, char='b' (letter):
//    size=2
//    j=0: "a1b" → flip index 2 → "a1B"
//    j=1: "A1b" → flip index 2 → "A1B"
//    result = ["a1b", "A1b", "a1B", "A1B"]

