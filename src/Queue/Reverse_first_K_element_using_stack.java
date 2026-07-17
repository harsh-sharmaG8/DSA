package Queue;

import java.util.Queue;
import java.util.Stack;

public class Reverse_first_K_element_using_stack {
    public static void reverseFirstK(Queue<Integer> q, int k) {
        if (q.isEmpty() || k <= 0 || k > q.size()) {
            return;
        }
        Stack<Integer> stack = new Stack<>();
        int m = q.size() - k;
        for (int i = 0; i < m; i++) {
            stack.push(q.poll());
        }
        while (!stack.empty()) {
            q.add(stack.pop());
        }
        int size = q.size();

        while (size > 1) {
            q.offer(q.poll());
            size--;
        }
    }
    // Q=[10,20,30,40,50,60,70,80,90,100], k=5;
    //ans=[50,40,30,20,10,60,70,80,90,100];

}
