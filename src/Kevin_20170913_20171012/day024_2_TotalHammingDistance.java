package Kevin_20170913_20171012;

public class day024_2_TotalHammingDistance {
    public int totalHammingDistance(int[] nums) {
        int mask = 1;
        int countZero = 0;
        int countOne = 0;
        int res = 0;
        for (int i = 0; i < 32; i++) {
            for (int num : nums) {
                if ((num & mask) == 0){
                    countZero++;
                }else {
                    countOne++;
                }
            }
            res += countZero * countOne;
            mask = mask << 1;
            countZero = 0;
            countOne = 0;
        }
        return res;
    }
}
