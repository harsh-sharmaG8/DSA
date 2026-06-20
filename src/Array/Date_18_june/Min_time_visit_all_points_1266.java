package Array.Date_18_june;

public class Min_time_visit_all_points_1266 {
    public static int minTimeToVisitAllPoints(int[][] points) {
        int ans = 0;
        for (int i = 0; i < points.length - 1; i++) {int currX = points[i][0];
                int currY = points[i][1];
                int targetX = points[i + 1][0];
                int targetY = points[i + 1][1];
                ans += Math.max(Math.abs(targetX - currX), Math.abs(targetY - currY));
        }

        return ans;
    }

    public static void main(String[] args) {
        int[][] arr = {{1,1},{3,4},{-1,0}};
        System.out.println(minTimeToVisitAllPoints(arr));
    }
}

/// explanation:
//Consider two consecutive points:
//
//        (x1, y1) → (x2, y2)
//
//Compute:
//
//dx = |x2 - x1|
//dy = |y2 - y1|
//Step 1: Use diagonal moves optimally
//A diagonal move reduces both dx and dy by 1 in one second.
//So we should use diagonal moves as much as possible.
//
//The maximum number of diagonal moves we can make is:
//
//min(dx, dy)
//
//After these diagonal moves:
//
//One direction becomes zero
//The other direction has remaining distance |dx - dy|
//Step 2: Finish remaining distance
//Once either x or y distance becomes zero, we can only move:
//
//Horizontally or
//Vertically
//Each such move reduces the remaining distance by 1 and costs 1 second.
//
//        Step 3: Total time for one segment
//Putting it together:
//
//time = diagonal_moves + remaining_moves
//= min(dx, dy) + |dx - dy|
//        = max(dx, dy)
//
//So the minimum time to move between two points is simply:
//
//max(|x2 - x1|, |y2 - y1|)