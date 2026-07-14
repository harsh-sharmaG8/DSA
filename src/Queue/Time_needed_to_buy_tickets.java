package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class Time_needed_to_buy_tickets {
    public static int timeRequiredToBuy(int[] tickets, int k) {
        int time = 0;
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < tickets.length; i++) {
            q.add(i);
        }
        while (!q.isEmpty()) {
            time++;
            int front = q.poll();
            tickets[front]--;
            if (tickets[front] != 0) {
                q.add(front);
            } else {
                if (front == k) {
                    return time;
                }

            }
        }
        return time;
    }

    public static void main(String[] args) {
        int[] tickets ={5,6,4,3,2};
        System.out.println(timeRequiredToBuy(tickets,3));
    }
}
