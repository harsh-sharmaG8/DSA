package Array.Date_19_june;

import java.util.Arrays;

public class setZeromatrix {
    public static void setZeroes(int[][] matrix) {
        boolean firstrow = false;
        boolean firstcol = false;
        int n = matrix.length;
        int m = matrix[0].length;
        for (int i = 0; i < m; i++) {
            if (matrix[0][i] == 0) {
                firstrow = true;
                break;
            }
        }
        for (int j = 0; j < n; j++) {
            if (matrix[j][0] == 0) {
                firstcol = true;
                break;
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                if (matrix[0][j] == 0 || matrix[i][0] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }
        for (int i = 0; i < m; i++) {
            if (firstrow) {
                matrix[0][i] = 0;
            }
        }
        for (int i = 0; i < n; i++) {
            if (firstcol) {
                matrix[i][0] = 0;
            }
        }
    }
    public static void main(String[] args) {
        int[][] matrix={{1,1,1},{1,0,1},{1,1,1}};
        setZeroes(matrix);
        System.out.println(Arrays.deepToString(matrix));
    }

}
//public static void setZeroes(int[][] matrix) {
//        int n = matrix.length;
//        int m = matrix[0].length;
//        boolean[] row= new boolean[n];
//        boolean[] col = new boolean[m];
//        for(int i= 0; i< n; i++){
//            for(int j=0; j<m; j++){
//                if(matrix[i][j]==0){
//                    row[i]=true;
//                    col[j]=true;
//
//                }
//            }
//        }
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < m; j++) {
//                if(row[i] || col[j]){
//                    matrix[i][j]=0;
//                }
//            }
//
//        }
//
//    }


