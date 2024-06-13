package Heap_PriorityQueue;

import java.util.PriorityQueue;

public class KthLargestElementInAnArray
{
    public int findKthLargest(int[] nums, int k)
    {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int num : nums)
        {
            minHeap.add(num);
        }
        while (minHeap.size()>k)
        {
            minHeap.poll();
        }
        return minHeap.peek();

    }
}
