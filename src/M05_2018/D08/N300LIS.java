package M05_2018.D08;

import java.util.Arrays;

public class N300LIS {
    public int lengthOfLIS(int[] nums) {
        int length = nums.length;
        int[] f = new int[length + 1];

        int fCur;
        int tempFCur;
        for (int i = 1; i <= length; i++) {
            fCur = 1;
            for (int j = 1; j < i; j++) {
                if (nums[i - 1] > nums[j - 1]){
                    if ((tempFCur = f[j] + 1) > fCur){
                        fCur = tempFCur;
                    }
                }
            }
            f[i] = fCur;
        }

        Arrays.sort(f);
        return f[length];
    }

    public static void main(String[] args){
        int[] nums = {4,10,4,3,8,9};

        N300LIS n300LIS = new N300LIS();
        int res = n300LIS.lengthOfLIS(nums);

        System.out.println(res);
    }
}
