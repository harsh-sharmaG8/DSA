package array;

public class prefix {
    public static void prefix(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            arr[i] = arr[i] + arr[i - 1];
        }
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        prefix(arr);
        System.out.println("Prefix Sum Array:");

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
