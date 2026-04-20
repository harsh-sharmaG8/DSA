package array;

public class findSingleNumber {
    public static int check(int[] arr){
        int result =0;
        for(int num: arr){
            result ^=num;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr={1,1,2,3,4,3,4};
        System.out.println(check(arr));
    }

}
