package tools;

public class Checker {
    public static boolean isSorted(int[] nums){
        for (int i = 0; i + 1 < nums.length; i++) {
            if (nums[i] > nums[i + 1]){
                return false;
            }
        }
        return true;
    }
}
