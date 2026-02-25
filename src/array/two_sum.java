package array;
import java.util.*;

public class two_sum {
        public static boolean twoSum(int[] arr, int target) {
            Arrays.sort(arr);

            int left = 0;
            int right = arr.length - 1;

            while (left < right) {
                int sum = arr[left] + arr[right];

                if (sum == target) {
                    return true;
                }
                else if (sum < target) {
                    left++;
                }
                else {
                    right--;
                }
            }
            return false;
        }

        public static void main(String[] args) {
            int[] arr = {2,7,11,15};
            int target = 9;

            System.out.println(twoSum(arr, target));
        }
    }
