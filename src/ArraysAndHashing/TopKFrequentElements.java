package ArraysAndHashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TopKFrequentElements
{
    public int[] topKFrequent(int[] nums, int k) {
        // Create a HashMap to count the frequency of each element
        HashMap<Integer, Integer> hm = new HashMap<>();

        for (int num : nums) {
            hm.put(num, hm.getOrDefault(num, 0) + 1);
        }

        // Create an array of lists to act as buckets
        List<Integer>[] bucket = new List[nums.length + 1];

        // Populate the buckets
        for (int key : hm.keySet()) {
            int freq = hm.get(key);
            if (bucket[freq] == null) {
                bucket[freq] = new ArrayList<>();
            }
            bucket[freq].add(key);
        }

        // Prepare the answer array
        int[] ans = new int[k];
        int counter = 0;

        // Iterate over the buckets from the end to get the top k frequent elements
        for (int i = bucket.length - 1; i >= 0 && counter < k; i--) {
            if (bucket[i] != null) {
                for (int j = 0; j < bucket[i].size() && counter < k; j++) {
                    ans[counter] = bucket[i].get(j);
                    counter++;
                }
            }
        }

        return ans;
    }
}
