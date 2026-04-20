package Date_10_March;

public class sliding_window {
    public static int sliding(int[] arr,int k){
        int sum=0;
        int max= Integer.MIN_VALUE;
        for(int i=0; i<k; i++){
            sum+=arr[i];
        }
        for(int i=k; i<arr.length; i++){
            sum = sum-arr[i-k]+arr[i];
            max = Math.max(max,sum);

        }
        return max;

    }
    //   BRUTE FORCE
//        int n  = arr.length-1;
//        int t= n-2;
//        int max=Integer.MIN_VALUE;
//        for(int i=0; i<=t;i++){
//            int sum=0;
//            for(int j=i; j<=i+2;j++){
//                sum +=arr[j];
//                max= Math.max(max,sum);
//            }
//        }
//        return max;
//    }

    public static void main(String[] args) {
        int[] arr ={2,1,5,1,3,2};
        System.out.println(sliding(arr, 3));
    }
}
