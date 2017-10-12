package Kevin_20170913_20171012;

public class GOOD_day029_1_MajorityElement {
    //Moore Voting Algorithm
    public int majorityElement(int[] nums) {
        int res = 0;
        int mask = 1;
        int count = 0;
        for (int i = 0; i < 32; i++) {
            for (int num : nums) {
                if ((num & mask) != 0) count++;
            }
            if (count > nums.length / 2) res = res | mask;
            mask = mask << 1;
            count = 0;
        }
        return res;
    }
}
