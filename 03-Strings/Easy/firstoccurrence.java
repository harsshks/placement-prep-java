import java.util.*;

public class firstoccurrence {
    public static int firstoccurrence(String haystack, String needle) {
        if (needle.isEmpty()) {
            return 0; // If needle is empty, return 0 as per the problem statement
        }

        int haystackLength = haystack.length();
        int needleLength = needle.length();

        for (int i = 0; i <= haystackLength - needleLength; i++) {
            if (haystack.substring(i, i + needleLength).equals(needle)) {
                return i; // Return the index of the first occurrence
            }
        }
        return -1; // Return -1 if needle is not found in haystack
    }
}
