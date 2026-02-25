package array;

import java.util.Scanner;

public class linear_search {

    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int[] arr = {1,3,5,7,4,9};
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the target:");
        int target = sc.nextInt();
        System.out.println(linearSearch(arr, target));

    }
}