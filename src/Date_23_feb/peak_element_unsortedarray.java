package Date_23_feb;

public class peak_element_unsortedarray {
    public static int findPeakElement(int[] nums) {
        int s = 0;
        int e = nums.length - 1;
        while (s < e) {
            int mid = s + (e - s) / 2;
            if (nums[mid] > nums[mid + 1]) {
                e = mid;
            } else {
                s = mid + 1;
            }
        }
        return s;
    }
//        int s=0;
//        int n= arr.length-1;
//        int e=n;
//        int ans=0;
//        while(s<e){
//            if(arr[s]>=arr[e]){
//                if(arr[ans]<arr[s]){
//                    ans=s;
//                }
//                s++;
//            }
//            else{
//                if(arr[ans]<arr[e]){
//                    ans=e;
//                }
//                e--;
//            }
//        }
//
//        return ans;

    public static void main(String[] args) {
        int[] nums = {9, 7, 3, 7, 8};
        System.out.println(findPeakElement(nums));

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