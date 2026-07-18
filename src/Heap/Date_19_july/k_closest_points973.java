package Heap.Date_19_july;

import java.util.Arrays;
import java.util.PriorityQueue;

public class k_closest_points973 {
    public static int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> pq= new PriorityQueue<>((p1, p2)->p2[0] * p2[0] + p2[1] * p2[1] - p1[0] * p1[0] - p1[1] * p1[1]);
        for(int[] p: points){
            pq.offer(p);
            if(pq.size()>k){
                pq.poll();
            }
        }
        int[][] res = new int[k][2];
        while(k>0){
            res[--k]= pq.poll();
        }
        return res;
    }

    public static void main(String[] args) {
        int[][] points={{8, -8}, {-2, -7}, {5, 4}, {5, 10}};
        System.out.println(Arrays.deepToString(kClosest(points, 2)));
    }

}
