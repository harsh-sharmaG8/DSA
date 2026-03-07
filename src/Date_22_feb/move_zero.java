package Date_22_feb;

public class move_zero {
    public static void moveZeroes(int[] nums) {
        int lastpos = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                int temp = nums[i];
                nums[i] = nums[lastpos];
                nums[lastpos] = temp;
                lastpos++;
            }
        }
        for (int i : nums) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        int[] arr={0,1,0,3,12};
        moveZeroes(arr);
    }
}
