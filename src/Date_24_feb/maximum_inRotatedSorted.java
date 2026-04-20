package Date_24_feb;

public class maximum_inRotatedSorted {
    public static int findMax(int[] nums){
            int s = 0;
            int e = nums.length - 1;
            while (s <= e) {
                int mid = s + (e - s) / 2;
                if (mid < e && nums[mid] > nums[mid + 1]) {
                    return nums[mid];
                }
                if (nums[mid] >= nums[s]){
                    s = mid + 1;
                }
                else {
                    e = mid - 1;
                }
            }
            return nums[nums.length - 1];
        }

    public static void main(String[] args) {
        int[] arr={4,5,6,7,0,1,2};
        System.out.println(findMax(arr));
    }
    }