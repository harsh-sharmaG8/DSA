package array;

public class reverse_integer {
    public static int reverse(int num) {
        int x = Math.abs(num);
        int reversed= 0;
        while(x>0){
            int lastdigit = x %10;
            if(reversed > (Integer.MAX_VALUE)/10 || reversed < (Integer.MIN_VALUE)/10){
                return 0;
            }
            reversed = reversed * 10 + lastdigit;
            x= x/10;
        }
        return(num<0)? -reversed : reversed;
    }

    public static void main(String[] args) {
        System.out.println(reverse(358));
    }
}
