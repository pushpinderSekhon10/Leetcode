package Heap_PriorityQueue;

import java.util.Collections;
import java.util.PriorityQueue;

public class LastStoneWeight
{
    private PriorityQueue<Integer> maxHeap;

    public int lastStoneWeight(int[] stones) {
        maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        for (int stone : stones) {
            maxHeap.add(stone);
        }

        while (maxHeap.size() > 1) {
            breakStones();
        }

        return maxHeap.isEmpty() ? 0 : maxHeap.peek();
    }

    private void breakStones() {
        int x = maxHeap.poll();
        int y = maxHeap.poll();

        if (x != y) {
            maxHeap.add(x - y);
        }
    }
}
