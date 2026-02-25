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
}
