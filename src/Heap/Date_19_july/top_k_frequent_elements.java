package Heap.Date_19_july;

import java.util.*;
import java.util.PriorityQueue;

public class top_k_frequent_elements {
    public static int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num: nums){
            map.put(num , map.getOrDefault(num,0)+1);
        }

        // Step 2: Min-heap based on frequency
        // PriorityQueue stores int[]{element, frequency}
        //compare by frequency[1] not [0] (ascending)
        PriorityQueue<int[]> heap = new PriorityQueue<>((a, b)->a[1]-b[1]);
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            heap.offer(new int[]{entry.getKey(), entry.getValue()});

            if(heap.size()>k){
                heap.poll();
            }
        }
        int[] arr=new int[k];
        while(k>0){
            arr[--k]=heap.poll()[0];
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] nums= {1,1,1,2,2,3};
        System.out.println(Arrays.toString(topKFrequent(nums, 2)));
    }
}
