import java.util.*;

public class groupanagrams {
    public static List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null || strs.length == 0) {
            return new ArrayList<>(); // Return an empty list if input is null or empty
        }

        Map<String, List<String>> map = new HashMap<>();

        for (String str : strs) {
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray); // Sort the characters of the string
            String sortedStr = new String(charArray); // Create a new string from the sorted characters

            // If the sorted string is not in the map, add it with a new list
            if (!map.containsKey(sortedStr)) {
                map.put(sortedStr, new ArrayList<>());
            }
            map.get(sortedStr).add(str); // Add the original string to the corresponding list
        }

        return new ArrayList<>(map.values()); // Return the grouped anagrams as a list of lists
    }
}
