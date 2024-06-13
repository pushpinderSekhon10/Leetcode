package SlidingWindow;

import java.util.HashSet;

public class LongestSubstringWithoutRepeatingCharacters
{
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> hs = new HashSet<>();
        int maxLen = 0;
        int l = 0; // Left pointer of the sliding window

        for (int r = 0; r < s.length(); r++) { // r is the right pointer
            while (hs.contains(s.charAt(r))) {
                // Remove the leftmost character until no duplicates in the window
                hs.remove(s.charAt(l));
                l++;
            }
            hs.add(s.charAt(r));
            maxLen = Math.max(maxLen, r - l + 1); // Update max length found so far
        }

        return maxLen;
    }
}
