import java.util.*;

public class longestcommonprefix {
    public static String longestCommonPrefix(String[] strs) {
        if(strs == null || strs.length == 0){
            return "";
        }

        Arrays.sort(strs); // Sort the array to bring similar prefixes together

        String s1 = strs[0];
        String s2 = strs[strs.length - 1];

        int idx = 0;

        while(idx < s1.length() && idx < s2.length()){
            if(s1.charAt(idx) != s2.charAt(idx)){
                break;
            }
            idx++;
        }
        return s1.substring(0, idx);
    }
}
