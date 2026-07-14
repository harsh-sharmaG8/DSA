package Stack;
import java.util.*;

public class stack_minimum_in_O1 {
    Stack<Integer> stack = new Stack<>();
    Stack<Integer> minstack = new Stack<>();

    public void push(int val) {
        stack.push(val);
        if (minstack.isEmpty() || val <= minstack.peek()) {
            minstack.push(val);
        } else {
            minstack.push(minstack.peek());
        }
    }
    public void pop() {
        stack.pop();
        minstack.pop();

    }
    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minstack.peek();
    }
}

//There are two optimizations.
///Approach 1: Store only new minimums
//Instead of pushing the minimum every time,

//stack:    5 2 8 1 7
//minStack: 5 2   1

//Whenever you pop,

//        if the popped element equals the current minimum, pop from minStack too.

//This saves space because minStack only stores actual minimum values.
//Worst-case space is still O(n) (if elements are inserted in decreasing order), but average space is much better.

///Approach 2: One-stack encoding (Most Optimal)
//This is the famous interview solution.

//Maintain:

//Stack<Long> stack;
//long min;

//When pushing:

//If val >= min, push normally.
//If val < min, push an encoded value
//        encoded = 2 * val - min

//and update
//min = val

//When popping:
//If the top is smaller than min, it means it's an encoded value.
//
//Recover the previous minimum using

//        previousMin = 2 * min - encoded

//This solution uses
//Time: O(1)
//Extra Space: O(1)

///private Stack<Long> stack;
//private long min;

//public MinStack() {
//    stack = new Stack<>();
//}

//public void push(int val) {
//    if (stack.isEmpty()) {
//        stack.push((long) val);
//        min = val;
//    }
//    else if (val >= min) {
//        stack.push((long) val);
//    }
//    else {

//        // Encode the value
//        stack.push(2L * val - min);

//        // Update minimum
//        min = val;
//    }
//}

//public void pop() {
//    long top = stack.pop();

//    // Encoded value
//    if (top < min) {

//        // Restore previous minimum
//        min = 2 * min - top;
//    }
//}

//public int top() {
//    long top = stack.peek();

//    if (top < min)
//        return (int) min;
//
//    return (int) top;
//}

//public int getMin() {
//    return (int) min;
//}