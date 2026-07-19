package Heap.Date_19_july;

import java.util.*;

public class Task_scheduling {
    public static int leastInterval(char[] tasks, int n) {
        Map<Character, Integer> freqMap = new HashMap<>();
        for (char task : tasks) {
            freqMap.put(task, freqMap.getOrDefault(task, 0) + 1);
        }
        PriorityQueue<Integer> MaxHeap = new PriorityQueue<>(Collections.reverseOrder());
        MaxHeap.addAll(freqMap.values());

        Queue<int[]> coolingQueue = new LinkedList<>();
        int time = 0;

        while (!MaxHeap.isEmpty() || !coolingQueue.isEmpty()) {
            time++;

            if (!MaxHeap.isEmpty()) {
                int freq = MaxHeap.poll() - 1;
                if (freq > 0) {
                    coolingQueue.offer(new int[]{freq, time + n});
                }
            }
            if (!coolingQueue.isEmpty() && coolingQueue.peek()[1] == time) {
                MaxHeap.offer(coolingQueue.poll()[0]);
            }
        }
        return time;

    }

    public static void main(String[] args) {
        char[] tasks = {'A', 'A', 'C', 'A', 'B', 'B', 'B', 'C'};
        int n = 2;
        System.out.println(leastInterval(tasks, n));
    }
}
