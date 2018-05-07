package M03_2018.D22;

public class ShellSort {
    public static void sort(int[] nums){
        int d = nums.length / 2;
        while (d >= 1){
            sortHelper(nums, d);
            d /= 2;
        }
    }

    private static  void sortHelper(int[] nums, int d){
        for (int i = 0; i < d; i++) {
            for (int j = i; j < nums.length; j += d) {
                int toBeInserted = nums[j];
                int before = j - d;
                while (before >= i && nums[before] > toBeInserted){
                    nums[before + d] = nums[before];
                    before -= d;
                }
                nums[before + d] = toBeInserted;
            }
        }
    }
}
