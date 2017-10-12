package Kevin_20170913_20171012;

public class day022_2_SingleElementInASortedArray {
    //尝试使用二分法查找
    public int singleNonDuplicate(int[] nums) {
        for (int i = 0; i < nums.length; i += 2) {
            if (i == nums.length - 1) return nums[i];
            if (nums[i] != nums[i + 1]) return nums[i];
        }
        return 0;
    }
}
