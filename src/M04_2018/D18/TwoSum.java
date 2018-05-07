package M04_2018.D18;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static int[] solveSlow(int[] nums, int target){
        for(int i = 0; i < nums.length; i++){
            for(int j = i + 1; j < nums.length; j++){
                if(nums[i] + nums[j] == target){
                    int[] res = new int[2];
                    res[0] = i;
                    res[1] = j;
                    return res;
                }
            }
        }
        return null;
    }

    public static int[] solveFast(int[] nums, int target){
        Map<Integer, Integer> map = new HashMap<>((int)(nums.length / 0.75));

        int cur = 0;
        Integer compose = null;
        for (int i = 0; i < nums.length; i++) {
            if ((compose = map.get(target - (cur = nums[i]))) != null){
                int[] res = new int[2];
                res[0] = compose;
                res[1] = i;
                return res;
            }
            map.put(cur, i);
        }
        return null;
    }
}
