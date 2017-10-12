package Kevin_20170913_20171012;

public class GOOD_day013_2_minMoves {
    public int minMoves(int[] nums) {
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num < min) min = num;
        }

        int res = 0;
        for (int num : nums) {
            res += num - min;
        }
        return res;
    }
}
