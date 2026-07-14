package Stack.Date_15_july;

import java.util.Stack;

public class Sort_stack {
    public void sort(Stack<Integer> stack){
        if(stack.empty()){
            return;
        }
        int top= stack.pop();
        sort(stack);
        insert(stack,top);
    }
    public void insert(Stack<Integer> stack, int value){
        if(stack.empty() || stack.peek()<=value){
            stack.push(value);
            int top = stack.pop();
            insert(stack,value);
            stack.push(top);
        }
    }

}
