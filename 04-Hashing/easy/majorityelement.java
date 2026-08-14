import java.util.HashMap;

public class majorityelement {
    public static int majorityelement(int[] nums){
        HashMap<Integer, Integer> map = new HashMap<>();
        int majorityCount = nums.length / 2;
        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
            if(map.get(num) > majorityCount){
                return num;
            }
        }
        return -1; // This line should never be reached if the input is valid
    }
}
