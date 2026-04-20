package Date_23_feb;

public class peak_element_unsortedarray {
    static int findPeak(int[] arr) {
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if ((arr[mid] >= arr[mid-1]) && arr[mid] >= arr[mid+1]) {
                return mid;
            }
            else if (arr[mid-1] > arr[mid]) {
                high = mid - 1;
            }
            else {
                low = mid + 1;

            }
        }
        return -1;
    }
     public static void main(String[] args) {
        int[] nums = {5,4,3,2};
        System.out.println(findPeak(nums));

    }
}

//7. The Golden Trick (Very Important)
//
//When solving peak problems remember:
//
//compare mid with mid+1
//
//Not both neighbours.
//
//        Rule:
//
//nums[mid] > nums[mid+1] → peak left
//nums[mid] < nums[mid+1] → peak right