package Array.Date_12_july;

import java.util.*;

public class Rank_transform_array {
    public static int[] arrayRankTransform(int[] arr) {
        HashMap<Integer, Integer> map=  new HashMap<>();
        int[] res = arr.clone();
        Arrays.sort(res);
        int rank=1;
        for(int i=0; i<res.length; i++){
            if(!map.containsKey(res[i])){
                map.put(res[i],rank++);
            }
        }
        for(int i=0; i<arr.length; i++){
            res[i]= map.get(arr[i]);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr= {40,10,30,20};
        System.out.println(Arrays.toString(arrayRankTransform(arr)));
    }
}
