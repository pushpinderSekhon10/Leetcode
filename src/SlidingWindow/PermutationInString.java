package SlidingWindow;

public class PermutationInString
{
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) return false;

        int[] s1Count = new int[26];
        int[] s2Count = new int[26];

        // Populate the counts for s1 and the first window of s2
        for (int i = 0; i < s1.length(); i++) {
            s1Count[s1.charAt(i) - 'a']++;
            s2Count[s2.charAt(i) - 'a']++;
        }

        // Start sliding over s2
        for (int i = 0; i <= s2.length() - s1.length(); i++) {
            if (check(s1Count, s2Count)) {
                return true;
            }
            if (i < s2.length() - s1.length()) {
                // Slide the window: remove one letter from the left, add one from the right
                s2Count[s2.charAt(i) - 'a']--;
                s2Count[s2.charAt(i + s1.length()) - 'a']++;
            }
        }

        // Final check for the last possible window
        return check(s1Count, s2Count);
    }

    // Helper method to compare two character count arrays
    public boolean check(int[] x, int[] y) {
        for (int i = 0; i < x.length; i++) {
            if (x[i] != y[i]) {
                return false;
            }
        }
        return true;
    }
}
