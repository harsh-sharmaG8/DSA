package Array.Date_8_july;

import java.util.*;

public class Absolute_min_differnce {
    public static List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        int min= Integer.MAX_VALUE;
        for(int i=1; i<arr.length; i++){
            min=Math.min(min,arr[i]-arr[i-1]);
        }
        List<List<Integer>> list= new ArrayList<>();
        for(int i=1; i<arr.length; i++){
            if(arr[i]-arr[i-1]==min){
                list.add(Arrays.asList(arr[i-1], arr[i])); // this
              //list.add(Arrays.asList(arr[i], arr[i-1]));   not this
            }
        }
        return list;
    }

    public static void main(String[] args) {
        int[] arr={4,2,1,3};
        System.out.println(minimumAbsDifference(arr));
    }
}
