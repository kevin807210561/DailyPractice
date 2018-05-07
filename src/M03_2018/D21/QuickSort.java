package M03_2018.D21;

public class QuickSort {
    public static void sort(int[] nums){
        helper(nums, 0, nums.length - 1);
    }

    private static void helper(int[] nums, int left, int right){
        if (left >= right)
            return;

        int pivot = partition(nums, left, right);
        helper(nums, left, pivot - 1);
        helper(nums, pivot + 1, right);
    }

    private static int partition(int[] nums, int left, int right){
        int pivotKey = nums[left];
        int pivotPointer = left;

        while (left < right){
            while (left < right && nums[right] >= pivotKey) right--;
            while (left < right && nums[left] <= pivotKey) left++;
            swap(nums, left, right);
        }

        swap(nums, left, pivotPointer);
        return left;
    }

    private static void swap(int[] nums, int index1, int index2){
        int temp = nums[index1];
        nums[index1] = nums[index2];
        nums[index2] = temp;
    }
}
