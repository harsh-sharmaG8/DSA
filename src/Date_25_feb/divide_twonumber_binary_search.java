package Date_25_feb;

import java.util.Scanner;

public class divide_twonumber_binary_search {
    public static int two_num_divide(int[]arr, int divisor, int dividend){
        int s=0;
        int ans=0;
        int e= dividend;
        while (s <=e) {
            int mid = s + (e - s) / 2;
            if (mid * divisor == dividend) {
                return mid;
            } else if (mid * divisor > dividend) {
                e = mid - 1;
            } else {
                ans = mid;
                s = mid + 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the divisor:");
        int divisor = sc.nextInt();
        System.out.println("enter the dividend:");
        int dividend = sc.nextInt();
        int[] arr = new int[dividend+1];
        for(int i=0; i<= dividend; i++){
            arr[i]=i;
        }
        System.out.println(two_num_divide(arr,2,10));

    }

}
