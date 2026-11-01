package Array.Date_12_july;

public class Second_smallest {
    public static int find_second_smallest(int[] arr){
        int smallest= Integer.MAX_VALUE;
        int secondSmallest=  Integer.MAX_VALUE;
        for(int num : arr){
            if(num<smallest){
                secondSmallest= smallest;
                smallest= num;
            }else if(num > smallest && num < secondSmallest){
                secondSmallest= num;
            }
        }
        return secondSmallest;
    }

    public static void main(String[] args) {
        int[] arr = {6,3,4,2,1};
        System.out.println(find_second_smallest(arr));
    }
}
