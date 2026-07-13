package Array.Date_13_july;

import java.util.*;

public class Sequntil_Digits {
    public static List<Integer> sequentialDigits(int low, int high) {
        List<Integer> list = new ArrayList<>();
        String s= "123456789";
        int minlen= String.valueOf(low).length();
        int maxlen= String.valueOf(high).length();

        for(int i= minlen; i<=maxlen; i++){
            for(int start=0; start+i<=9; start++){
                String substr= s.substring(start,start+i);
                int num = Integer.parseInt(substr);
                if(num>=low && num<=high){
                    list.add(num);
                }
            }
        }
        return list;
    }

    public static void main(String[] args) {
        System.out.println(sequentialDigits(100,10000));
    }
}


//public List<Integer> sequentialDigits(int low, int high) {
//    List<Integer> list = new ArrayList<>();
//    for(int i=low; i<high; i++){
//        if(checkSequence(i)){
//            list.add(i);
//        }
//        else{
//            continue;
//        }
//    }
//    return list;
//}
//public boolean checkSequence(int num){
//    Stack<Integer> stack = new Stack<>();
//    while(num!=0){
//        int rem= num%10;
//        if(stack.empty()){
//            stack.add(rem);
//            num=num/10;
//        }
//        else{
//            if(rem+1==stack.peek()){
//                stack.add(rem);
//                num=num/10;
//            }
//            else{
//                return false;
//            }
//        }
//    }
//    return true;