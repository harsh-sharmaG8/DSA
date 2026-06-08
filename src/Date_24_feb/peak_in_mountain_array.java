package Date_24_feb;

public class peak_in_mountain_array {
    public static int peak(int[]arr){
        int s=0;
        int n= arr.length;
        int e= n-1;
        while(s<e){
            int mid = (s + (e - s)) / 2;
            if(arr[mid]<arr[mid+1]){
                s= mid+1;
            }
            else{
                e= mid;

            }

        }
        return arr[s];
    }

    public static void main(String[] args) {
        int[] arr = {0,11,10,5,2};
        System.out.println(peak(arr));

    }

    public static class peak_element_unsortedarray {

        static int findPeak(int[] arr) {
            int n =arr.length;
            if(n==0) return 0;
            if(arr[0]>arr[1]) return 0;
            if(arr[n-1]>arr[n-2]) return n-1;
            int low = 1;
            int high = n-2;

            while (low <= high) {
                int mid = low + (high - low) / 2;

                if (arr[mid] > arr[mid - 1] && arr[mid] > arr[mid +1] ) {
                    return mid;    // Peak is on left side (including mid)
                } else if(arr[mid] > arr[mid - 1]){
                    low = mid + 1;   // Peak is on right side
                }
                else{
                    high= mid-1;
                }
            }

            return -1;
        }

        public static void main(String[] args) {
            int[] nums = {1,10,13,7,6,5,4,2,1,0};
            System.out.println(findPeak(nums)); // 0
        }
    }
}
