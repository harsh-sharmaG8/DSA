package Dynamic_Programming.Date_2_aug;

public class Stone_game {
    public static boolean stoneGame(int[] piles) {
        Integer[][] memo = new Integer[piles.length][piles.length];
        return solve(piles, 0, piles.length - 1, memo) > 0;
    }

    public static int solve(int[] piles, int left, int right, Integer[][] memo) {
        if (left == right)
            return piles[left];

        if (memo[left][right] != null)
            return memo[left][right];

        int pickLeft = piles[left] - solve(piles, left + 1, right, memo);
        int pickRight = piles[right] - solve(piles, left, right - 1, memo);

        memo[left][right] = Math.max(pickLeft, pickRight);

        return memo[left][right];
    }

    public static void main(String[] args) {
        int[] piles ={3,7,2,3};
        System.out.println(stoneGame(piles));
    }
}


//public boolean stoneGame(int[] piles) {
//    int scoreDifference = solve(piles, 0, piles.length - 1);
//
//    return scoreDifference > 0;
//}

//private int solve(int[] piles, int left, int right) {
//
//    // Base case
//    if (left == right) {
//        return piles[left];
//    }
//
//    // Pick left pile
//    int pickLeft =
//            piles[left] - solve(piles, left + 1, right);
//
//    // Pick right pile
//    int pickRight =
//            piles[right] - solve(piles, left, right - 1);
//
//    return Math.max(pickLeft, pickRight);
//}