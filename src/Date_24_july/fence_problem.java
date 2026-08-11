package Date_24_july;

import java.util.PriorityQueue;

public class fence_problem {
    public static int slinding_window_fence(int[] arr,int k){
        int ans=1;
        int height_sum=0;
        int min= Integer.MIN_VALUE;
        for(int i=0; i<k; i++){
            height_sum+=arr[i];
        }
        for(int i=k; i<arr.length; i++){
            height_sum = height_sum-arr[i-k]+arr[i];
            if(height_sum<min){
                height_sum = Math.min(min,height_sum);
                ans= (i-k) +2;
            }
        }
        return ans;

    }
}
