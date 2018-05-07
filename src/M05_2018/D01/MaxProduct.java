package M05_2018.D01;

public class MaxProduct {
    public int maxProduct(int[] nums) {
        int max = nums[0];

        int maxPositive = max > 0 ? max : 0; // 0 represent that maxNotNegative is invalid
        int maxNotPositive = max <= 0 ? max : 1; // 1 represent that maxNegative is invalid
        int maxIncludesCur;
        int cur;
        int temp;
        for (int i = 1; i < nums.length; i++) {
            if ((cur = nums[i]) > 0) {
                maxIncludesCur = Math.max(cur, cur * maxPositive);
                maxPositive = maxIncludesCur;
                maxNotPositive = maxNotPositive == 1 ? 1 : cur * maxNotPositive;
            }else if (cur < 0){
                maxIncludesCur = Math.max(cur, cur * maxNotPositive);
                temp = maxPositive;
                maxPositive = maxNotPositive == 1 ? 0 : cur * maxNotPositive;
                maxNotPositive = Math.min(cur, cur * temp);
            }else {
                maxIncludesCur = 0;
                maxPositive = 0;
                maxNotPositive = 0;
            }
            max = Math.max(max, maxIncludesCur);
        }

        return max;
    }
}
