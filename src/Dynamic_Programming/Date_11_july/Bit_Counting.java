package Dynamic_Programming.Date_11_july;

import java.util.Arrays;

public class Bit_Counting {
    public static int[] countBits(int n) {
        int[] dp = new int[n+1];
        dp[0]=0;
        int sub=1;
        for(int i=1;i<=n; i++){
            if(sub * 2 == i){
                sub=i;
            }
            dp[i]=1 + dp[i-sub];
        }
        return dp;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(countBits(7)));
    }
}
//
//* -----------------------------------------------------------
//        *  i  |  binary  | bits |  relation
// * -----------------------------------------------------------
//         *  0  |   0000   |  0   |  base case
//        *  1  |   0001   |  1   |  1 + dp[i-1] = 1 + dp[0]
//        *  2  |   0010   |  1   |  1 + dp[i-2] = 1 + dp[0]
//        *  3  |   0011   |  2   |  1 + dp[i-2] = 1 + dp[1]
//        *  4  |   0100   |  1   |  1 + dp[i-4] = 1 + dp[0]
//        *  5  |   0101   |  2   |  1 + dp[i-4] = 1 + dp[1]
//        *  6  |   0110   |  2   |  1 + dp[i-4] = 1 + dp[2]
//        *  7  |   0111   |  3   |  1 + dp[i-4] = 1 + dp[3]
//        *  8  |   1000   |  1   |  1 + dp[i-8] = 1 + dp[0]
//        * -----------------------------------------------------------