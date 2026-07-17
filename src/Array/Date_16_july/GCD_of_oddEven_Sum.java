package Array.Date_16_july;

public class GCD_of_oddEven_Sum {
    public static int gcdOfOddEvenSums(int n) {
        return n;
    }

    public static void main(String[] args) {
        System.out.println(gcdOfOddEvenSums(5));
    }

}
//Approach 2: Mathematics
//        Intuition
//Observe that gcd(n
//2
//        ,n(n+1))=n×gcd(n,n+1)
//
//Since two consecutive integers are always coprime, gcd(n,n+1)=1
//
//Therefore, gcd(n
//2
//        ,n(n+1))=n
//
//which is exactly the required answer.