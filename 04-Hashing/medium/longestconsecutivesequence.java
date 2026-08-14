import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class longestconsecutivesequence {
    public static int longestConsecutive(int[] nums){
        if(nums.length == 0 || nums == null){
            return 0;
        }

        Set<Integer> set = new HashSet<>();

        for(int num : nums){
            set.add(num);
        }

        int longestStreak = 0;

        for(int num : set){
            if(!set.contains(num - 1)){
                int currentNum = num;
                int currentStreak = 1;

                while(set.contains(currentNum + 1)){
                    currentNum += 1;
                    currentStreak += 1;
                }

                longestStreak = Math.max(longestStreak, currentStreak);
            }
        }
        return longestStreak;
    }
    
}
