import java.util.*;

public class longestpalindromicsubstring {
    public static String longestPalindrome(String s) {
        if (s == null || s.length() < 1) {
            return ""; // Return an empty string for null or empty input
        }

        int start = 0, end = 0;

        for (int i = 0; i < s.length(); i++) {
            int len1 = expandAroundCenter(s, i, i); // Odd length palindrome
            int len2 = expandAroundCenter(s, i, i + 1); // Even length palindrome
            int len = Math.max(len1, len2);

            if (len > end - start) {
                start = i - (len - 1) / 2; // Update start index
                end = i + len / 2; // Update end index
            }
        }

        return s.substring(start, end + 1); // Return the longest palindromic substring
    }

    private static int expandAroundCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--; // Expand to the left
            right++; // Expand to the right
        }
        return right - left - 1; // Return the length of the palindrome
    }
    
}