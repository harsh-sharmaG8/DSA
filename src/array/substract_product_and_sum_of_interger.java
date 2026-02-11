package array;

public class substract_product_and_sum_of_interger {
    public static void main(String[] args) {
        int subtractProductAndSum; (int n){
            int product = 1;
            int sum = 0;
            int num = n;
            while (num > 0) {
                int temp = num % 10;
                product = product * temp;
                sum = sum + temp;
                num = num / 10;
            }
            int result = product - sum;
            return result;
        }
    }
}

