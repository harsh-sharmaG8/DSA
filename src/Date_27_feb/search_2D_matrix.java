    package Date_27_feb;

    import java.util.Arrays;

    public class search_2D_matrix {
//        public static int[] Binary_srch(int[] arr, int t,int ans) {
//            int s = 0;
//            int n = arr.length;
//            int e = n - 1;
//            while (s <= e) {
//                int mid = s + (e - s) / 2;
//                if (arr[mid] == t) {
//                    return new int[]{ans, mid};
//                } else if (arr[mid] < t) {
//                    s = mid + 1;
//                } else {
//                    e = mid - 1;
//                }
//
//            }
//            return new int[]{-1,-1};
//        }
//
//        public static int[] search_2D(int[][] arr, int target) {
//            int n = arr.length;
//            int m = arr[0].length;
//            for (int i = 0; i < n - 1; i++) {
//                if (arr[i][0] <= target && target <= arr[i][m - 1]) {
//                    int ans = i;
//                    return Binary_srch(arr[i], target, ans);
//                }
//            }
//            return new int[]{-1,-1};
//
//        }

//        public static void main(String[] args) {
//            int[][] arr = {
//                    {1, 3, 5},
//                    {7, 9, 11},
//                    {13, 15, 17}
//            };
//            int[] result= search_2D(arr,14);
//            System.out.println(Arrays.toString(result));
//            System.out.println(Arrays.toString(search_matrix(arr, 15)));
//        }

        public static int[] search_matrix(int[][] arr, int target) {
            int n = arr.length;
            int m = arr[0].length;

            int s = 0;
            int e = n * m - 1;

            while (s <= e) {

                int mid = s + (e - s) / 2;

                int row = mid / m;
                int col = mid % m;
                if (arr[row][col] == target) {
                    return new int[]{row, col};
                } else if (arr[row][col] > target) {
                    e= mid-1;
                } else {
                    s= mid+1;
                }


            }
            return new int[]{-1,-1};
        }

        public static void main(String[] args) {
                int[][] arr = {
                        {1, 3, 5},
                        {7, 9, 11},
                        {13, 15, 17}
                };
            int[] result= search_matrix(arr,17);
            System.out.println(Arrays.toString(result));
        }
    }
