package array;

public class sortedArrayChecking {
        public static boolean check(int[] nums) {
            int n = nums.length;
            int count = 0;
            for (int i = 0; i < n; i++) {
                if (nums[i] > nums[(i + 1) % n]) {
                    count++;
                }
            }
            return count <= 1;
        }

    public static void main(String[] args) {
        int[] arr={2,7,8,4,5};
        System.out.println(check(arr));

    }
}