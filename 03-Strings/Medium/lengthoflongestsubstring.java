import java.util.*;

public class lengthoflongestsubstring {
    public static int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) {
            return 0; // Return 0 for null or empty string
        }

        HashSet<Character> set = new HashSet<>();
        int left = 0, maxLength = 0;

        for (int right = 0; right < s.length(); right++) {
            char currentChar = s.charAt(right);

            // If the character is already in the set, remove characters from the left until it's not
            while (set.contains(currentChar)) {
                set.remove(s.charAt(left));
                left++;
            }

            set.add(currentChar); // Add the current character to the set
            maxLength = Math.max(maxLength, right - left + 1); // Update maxLength if needed
        }

        return maxLength; // Return the length of the longest substring without repeating characters
    }
}
