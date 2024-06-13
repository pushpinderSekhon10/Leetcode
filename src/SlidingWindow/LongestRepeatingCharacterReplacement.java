package SlidingWindow;

import java.util.HashMap;

public class LongestRepeatingCharacterReplacement
{
    public int characterReplacement(String s, int k) {
        int left = 0;
        int maxLength = 0;
        int maxCount = 0;
        HashMap<Character, Integer> countMap = new HashMap<>();

        for (int right = 0; right < s.length(); right++) {
            char current = s.charAt(right);
            countMap.put(current, countMap.getOrDefault(current, 0) + 1);

            maxCount = Math.max(maxCount, countMap.get(current));

            // If the number of characters to be replaced is more than k, shrink the window
            while (right - left + 1 - maxCount > k) {
                char leftChar = s.charAt(left);
                countMap.put(leftChar, countMap.get(leftChar) - 1);
                left++;
            }

            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
}
