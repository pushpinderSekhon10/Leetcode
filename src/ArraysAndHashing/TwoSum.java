package ArraysAndHashing;

import java.util.HashMap;

public class TwoSum
{
    public int[] twoSum(int[] nums, int target) {
    HashMap<Integer, Integer> hm = new HashMap<>();

    // Instead of filling the HashMap first, we check during the insertion process
    for (int i = 0; i < nums.length; i++) {
        int complement = target - nums[i];

        // Check if the complement of the current element exists in the map
        if (hm.containsKey(complement)) {
            return new int[] { hm.get(complement), i };
        }

        // Put the element and its index in the map
        hm.put(nums[i], i);
    }

    // If no solution is found, return an empty array instead of null
    return new int[0];
}
}
