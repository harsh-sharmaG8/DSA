package Array.Date_20_june;

import java.util.LinkedList;
import java.util.Queue;

class pair{
    int first;
    int second;
    pair(int first, int second){
        this.first= first;
        this.second= second;
    }
}

public class Number_of_island {
    public static void bfs(int ro, int co, int[][]vis, char[][]grid) {
        Queue<pair> q = new LinkedList<pair>();
        vis[ro][co] = 1;
        q.add(new pair(ro, co));

        int n = grid.length;
        int m = grid[0].length;

        while (!q.isEmpty()) {
            int row = q.peek().first;
            int col = q.peek().second;
            q.poll();

            int[] delrow = {-1, 1, 0, 0};
            int[] delcol = {0, 0, -1, 1};
            for (int i = 0; i < 4; i++) {
                // only checks for four.
                int nrow = row + delrow[i];
                int ncol = col + delcol[i];
                if (nrow >= 0 && ncol >= 0 && nrow < n && ncol < m && vis[nrow][ncol] == 0 && grid[nrow][ncol] == '1') {
                    vis[nrow][ncol] = 1;
                    q.add(new pair(nrow, ncol));
                }
            }
        }
    }

    public static int numIslands(char[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        int count = 0;
        int[][] vis = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (grid[i][j] == '1' && vis[i][j] == 0) {
                    count++;
                    bfs(i, j, vis, grid);
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        char[][] grid= {
                        {'1','1','0','0','0'},
                        {'1','1','0','0','0'},
                        {'0','0','1','0','0'},
                        {'0','0','0','1','1'}
                       };
        System.out.println(numIslands(grid));
    }
}

//check for eigth.
//for(int i=-1 i<=1; i++){
//    for(int j=-1; j<=1; j++){
//        int nrow= row + delrow[i];
//        int ncol= col + delcol[i];
//    }
//}

//class Solution {
//    public void dfs(int row, int col, int[][] vis, char[][] grid, int n, int m) {
//        // Base cases - stop recursion if:
//        if (row < 0 || col < 0 || row >= n || col >= m) return; // out of bounds
//        if (vis[row][col] == 1) return;   // already visited
//        if (grid[row][col] == '0') return; // water cell
//
//        // Mark current cell visited
//        vis[row][col] = 1;
//
//        // Recurse in all 4 directions
//        dfs(row - 1, col, vis, grid, n, m); // up
//        dfs(row + 1, col, vis, grid, n, m); // down
//        dfs(row, col - 1, vis, grid, n, m); // left
//        dfs(row, col + 1, vis, grid, n, m); // right
//    }
//
//    public int numIslands(char[][] grid) {
//        int row = grid.length;
//        int col = grid[0].length;
//        int count = 0;
//        int[][] vis = new int[row][col];
//
//        for (int i = 0; i < row; i++) {
//            for (int j = 0; j < col; j++) {
//                if (grid[i][j] == '1' && vis[i][j] == 0) {
//                    count++;
//                    dfs(i, j, vis, grid, row, col);
//                }
//            }
//        }
//        return count;
//    }
//}