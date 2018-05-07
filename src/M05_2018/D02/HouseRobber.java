package M05_2018.D02;

public class HouseRobber {
    public int rob(int[] nums) {
        int previous1 = 0;
        int previous2 = 0;
        int curMax;
        for (int i = 0; i < nums.length; i++) {
            curMax = Math.max(previous2, nums[i] + previous1);
            previous1 = previous2;
            previous2 = curMax;
        }
        return previous2;
    }
}
