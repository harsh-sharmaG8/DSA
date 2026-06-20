package Array.Date_19_june;

import java.util.Arrays;

public class spiral_matrix_II {
    public static int[][] generateMatrix(int n) {
        int left=0;
        int right=n-1;
        int top=0;
        int bottom=n-1;
        int num=1;
        int[][] arr = new int[n][n];
        while(num<=n*n){
            for(int i=left; i<=right;i++){
                arr[top][i]=num++;
            }
            top++;
            for(int i=top; i<=bottom; i++){
                arr[i][right]=num++;
            }
            right--;
            if(top<=bottom){
                for(int i=right; i>=left;i--){
                    arr[bottom][i]=num++;;
                }
            }
            bottom--;
            if(left<=right){
                for(int i=bottom;i>=top ;i--){
                    arr[i][left]=num++;;
                }
            }
            left++;
        }
        return arr;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(generateMatrix(3)));
    }
}
