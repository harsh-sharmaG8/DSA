package Date_05_March;

import java.util.Scanner;

public class hackwithinfy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of aaray:");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i=0;i<size; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("enter the number of queries:");
        int q= sc.nextInt();
        int sum=0;
        while(q-->0){
            System.out.println("enter the query:");
            int L = sc.nextInt();
            int r = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();
            int c =0;
            for(int j= L; j<r; j++){
                arr[j]= x + y*c;
                c++;
            }

            for(int k= L; k<r; k++){
                sum += arr[k];

            }

        }
        System.out.println(sum);
    }
}
