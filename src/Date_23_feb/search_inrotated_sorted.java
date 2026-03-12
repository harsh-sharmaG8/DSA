package Date_23_feb;

public class search_inrotated_sorted {
    public static int search(int[] arr, int target) {
        int s=0;
        int n= arr.length-1;
        int e=n;
        int ans=-1;
        while(s<=e){
            int mid = s+ (e-s)/2;
            if(arr[mid]==target){
                ans = mid;
            }
            // left half sorted
            if(arr[s]<=arr[mid]){
                if(target>=arr[s] && target<arr[mid]){
                    e=mid-1;
                }
                else{
                    s= mid+1;
                }
            }
            // right half sorted
            else{
                if(target>arr[mid] && target<=arr[e]){
                    s=mid+1;
                }
                else{
                    e=mid-1;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr={4,5,6,7,0,1,2};
        System.out.println(search(arr,0));

    }
}
