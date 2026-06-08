package array;

public class RemoveDuplicate {
    public static int removeDuplicates(int[] arr) {
        int j=0;
        for(int i=1;i<arr.length;i++){
            if(arr[j]!=arr[i]){
                j++;
                arr[j]=arr[i];
            }
        }
        return j+1;
    }

    public static void main(String[] args) {
        int[] arr={1,1,2,2,3,3,4,6};
        System.out.println(removeDuplicates(arr));

    }
}

