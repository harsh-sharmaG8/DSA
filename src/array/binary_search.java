package array;

public class binary_search {
    public static boolean binary_search(int[] arr, int target){
        int s=0;
        int e=arr.length-1;
        while(s<e){
            int mid = s+(e-s)/2;
            if(arr[mid]==target){
                return true;
            }
            else if(arr[mid]>target && target>arr[s]){
                e=mid;

            }
            else{
                s=mid+1;

            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {5,6,7,0,1,2};
        System.out.println(binary_search(arr, 1));
    }
}
