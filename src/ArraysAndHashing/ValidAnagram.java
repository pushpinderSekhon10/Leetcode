package ArraysAndHashing;

import java.util.HashMap;

public class ValidAnagram
{
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Integer> hm = new HashMap<>();

        // Populate the HashMap with counts from string s
        for (char c : s.toCharArray()) {
            hm.put(c, hm.getOrDefault(c, 0) + 1);
        }

        // Decrease counts based on string t
        for (char c : t.toCharArray()) {
            if (!hm.containsKey(c)) {
                return false;
            }
            hm.put(c, hm.get(c) - 1);
        }

        // Check if all counts are zero
        for (int val : hm.values()) {
            if (val != 0) {
                return false;
            }
        }

        return true;
    }
}
