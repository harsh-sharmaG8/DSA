package Stack.Date_15_july;

import java.util.Stack;

public class Reverse_Polish_Notation {
    public static int evalRPN(String[] tokens) {
        Stack<String> stack = new Stack<>();
        for(String ch:tokens){
            if(!ch.equals("+") && !ch.equals("-") && !ch.equals("*") && !ch.equals("/")){
                stack.push(ch);
            }
            else{
                int b = Integer.parseInt(stack.pop());
                int a = Integer.parseInt(stack.pop());
                int res=0;;
                if(ch.equals("+")){res= a+b;}
                if(ch.equals("-")){res= a-b;}
                if(ch.equals("/")){res= a/b;}
                if(ch.equals("*")){res= a*b;}
                stack.push(String.valueOf(res));


            }
        }
        return Integer.parseInt(stack.peek());
    }

    public static void main(String[] args) {
        String[] tokens= {"4","13","5","/","+"};
        System.out.println(evalRPN(tokens));
    }
}
