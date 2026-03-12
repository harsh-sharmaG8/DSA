package Date_24_feb;

public class pivot_minimum_inRotaedSorted {
    public static int findMin(int[] nums) {
        int s = 0;
        int e = nums.length - 1;
        while(s < e){
            int mid = s + (e - s)/2;
            if(nums[mid] > nums[e]){
                s = mid + 1;
            }
            else{
                e = mid;
            }
        }
        return nums[s];
    }

    public static void main(String[] args) {
        int[] arr={4,5,6,7,-1,0,1,2};
        System.out.println(findMin(arr));
    }
}

