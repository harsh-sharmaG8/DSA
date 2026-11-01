package Array.Date_12_july;

import com.sun.security.jgss.GSSUtil;

public class Second_largest {
    public static int find_second_largest(int[] nums) {
        int largest = Integer.MIN_VALUE;
        int secondLaregst = Integer.MIN_VALUE;
        for (int num : nums) {
            if (num > largest) {
                secondLaregst = largest;
                largest = num;
            } else if (num < largest && num > secondLaregst) {
                secondLaregst = num;
            }
        }
        return secondLaregst;
    }

    public static void main(String[] args) {
        int[] arr = {2,4,3,5,6};
        System.out.println(find_second_largest(arr));
    }
}
