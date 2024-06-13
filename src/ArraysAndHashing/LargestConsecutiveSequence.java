package ArraysAndHashing;

import java.util.HashSet;

public class LargestConsecutiveSequence
{
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> numbers = new HashSet<>();
        for (int num : nums) {
            numbers.add(num);
        }

        int longestStreak = 0;

        for (int num : nums) {
            if (!numbers.contains(num - 1)) { // Check if it's the start of a sequence
                int currentNum = num;
                int currentStreak = 1;

                while (numbers.contains(currentNum + 1)) {
                    currentNum += 1;
                    currentStreak += 1;
                }

                longestStreak = Math.max(longestStreak, currentStreak);
            }
        }

        return longestStreak;
    }
}
