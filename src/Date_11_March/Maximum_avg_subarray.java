package Date_11_March;

public class Maximum_avg_subarray {
    public static double findMaxAverage(int[] arr, int k) {
        double avg=0;
        double sum=0;
        double max = Double.MIN_VALUE;
        for(int i=0; i<k; i++){
            sum+=arr[i];
            avg=sum/k;
            max=avg;
        }
        for(int i=k; i<arr.length; i++){
            sum = sum-arr[i-k]+arr[i];
            avg = sum / k;
            max= Math.max(max, avg);

        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr={1,12,-5,-6,50,3};
        System.out.println(findMaxAverage(arr,3));

    }
}

