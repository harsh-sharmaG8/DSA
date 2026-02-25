package array;
import java.util.*;
public class two_arr_prefix {
    public static int rangeSum(int[] arr, int L, int R) {
        int sum=0;
        for(int i =L; i<=R; i++){
            sum += arr[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter number of queries: ");
        int q = sc.nextInt();
        while (q-- > 0) {
            System.out.print("Enter L and R: ");
            int L = sc.nextInt();
            int R = sc.nextInt();

            int sum = rangeSum(arr, L, R);
            System.out.println("Sum = " + sum);
        }
        sc.close();
    }
}
