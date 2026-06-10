package array;

public class RemoveDuplicate {
    public static int removeDuplicates(int[] arr) {
        int count=0;
        int i=0;
        for(int j=1;j<arr.length;j++){
            if(arr[j]!=arr[i]){
                count++;
                arr[i]=arr[j];
            }
        }
        return count+1;
    }

    public static void main(String[] args) {
        int[] arr={1,1,2,2,3,3,4,6};
        System.out.println(removeDuplicates(arr));

    }
}

