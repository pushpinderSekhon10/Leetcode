package Heap_PriorityQueue;

import java.util.PriorityQueue;

public class KthLargestElementInAStream
{
    public PriorityQueue<Integer> minHeap;
    int max;
    public void KthLargest(int k, int[] nums)
    {
        max =k;
        minHeap = new PriorityQueue<>();
        for (int num : nums)
        {
            minHeap.add(num);
        }
        while (minHeap.size()>max)
        {
            minHeap.poll();
        }

    }

    public int add(int val)
    {
        minHeap.add(val);
        while (minHeap.size()>max)
        {
            minHeap.poll();
        }
        return minHeap.peek();
    }
}
