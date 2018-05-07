package M03_2018.D21;

public class ShellSort {
    public static void sort(int[] nums){
        int d = nums.length / 2;

        while (d >= 1){
            helper(nums, d);
            d /= 2;
        }
    }

    private static void helper(int[] nums, int d){
        for(int i = 0; i < d; i++){
            for (int j = i; j < nums.length; j += d) {
                //待插入数据
                int toBeInserted = nums[j];
                //查找插入点
                for (int insertPoint = i; insertPoint <= j; insertPoint += d) {
                    if (nums[j] < nums[insertPoint]){
                        //将数据往后移
                        for (int k = insertPoint; k < j; k += d) {
                            nums[k + d] = nums[k];
                        }
                        //将待插入数据插入
                        nums[insertPoint] = toBeInserted;
                    }
                }
            }
        }
    }
}
