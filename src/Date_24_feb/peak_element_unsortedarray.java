package Date_24_feb;

public class peak_element_unsortedarray {
        static int findPeak(int[] arr) {
            int n= arr.length;
            if(n==0) return 0;
            if(arr[0] > arr[1])  return 0;
            if(arr[n-1]> arr[n-2]) return  n-1;
            int low = 1, high = n-2;
            while (low <= high) {
                int mid = (low + high) / 2;
                if ((arr[mid] >= arr[mid-1]) && arr[mid] >= arr[mid+1]) {
                    return mid;
                }
                else if (arr[mid] > arr[mid+1]) {
                    high = mid - 1;
                }
                else {
                    low = mid + 1;

                }
            }
            return -1;
        }
        public static void main(String[] args) {
            int[] nums = {8,9, 10, 13, 7,6 ,5 ,4 ,2, 1};
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

