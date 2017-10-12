package Kevin_20170913_20171012;

import java.util.Arrays;

public class day002_2_arrayPairSum {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums); //这里学习一下快排算法

        int res = 0;
        for (int i = 0; i < nums.length; i += 2) {
            res += nums[i];
        }
        return res;
    }
}
