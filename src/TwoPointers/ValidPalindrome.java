package TwoPointers;

public class ValidPalindrome
{
    public boolean isPalindrome(String s) {
        // Convert the string to lowercase
        s = s.toLowerCase();

        // Remove all non-alphanumeric characters
        s = s.replaceAll("[^a-z0-9]", "");

        char[] pal = s.toCharArray();
        int left = 0;
        int right = pal.length - 1;

        while (left < right) {
            if (pal[left] != pal[right]) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
