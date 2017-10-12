package Kevin_20170913_20171012;

import java.util.ArrayList;
import java.util.List;

public class GOOD_day014_2_findDisappearedNumbers {
    //这题将标记数组跟原数组合在一起的方法：
    //①对原数组在需要做标记的位置上的数字取为相反数，通过取绝对值得到原数
    //②对原数组在需要做标记的位置上的数字加上n，通过取模n得到原数
    public List<Integer> findDisappearedNumbers(int[] nums) {
        //将数组中的数字重排，使得nums[0] = 1, nums[1] = 2, nums[2] = 3, nums[3] = 4......，若某位置对应的数字不存在则将其置为0
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i + 1){
                int num = nums[i];
                int nextPlace = num - 1;
                while (num != 0 && nums[nextPlace] != num){
                    int tempNum = nums[nextPlace];
                    nums[nextPlace] = num;
                    num = tempNum;
                    nextPlace = num - 1;
                }

                if (nums[i] != i + 1) nums[i] = 0;
            }
        }

        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0){
                res.add(i + 1);
            }
        }
        return res;
    }
}
