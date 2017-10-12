package Kevin_20170913_20171012;

public class day009_2_findMaxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        int res = 0;
        int tempRes = 0;
        for (int num : nums) {
            if (num == 0){
                if (tempRes > res) res = tempRes;
                tempRes = 0;
            }else {
                tempRes++;
            }
        }
        if (tempRes > res) res = tempRes;
        return res;
    }
}
