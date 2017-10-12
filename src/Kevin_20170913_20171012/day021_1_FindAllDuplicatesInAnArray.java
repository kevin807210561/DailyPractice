package Kevin_20170913_20171012;

import java.util.ArrayList;
import java.util.List;

public class day021_1_FindAllDuplicatesInAnArray {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> res = new ArrayList<>();
        for (int num : nums) {
            if (nums[Math.abs(num) - 1] < 0) res.add(Math.abs(num));
            else nums[Math.abs(num) - 1] = -nums[Math.abs(num) - 1];
        }
        return res;
    }
}
