import java.util.Arrays;

public class day018_2_MaximumBinaryTree {
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        if (nums.length == 0 || nums == null) {
            return null;
        }

        int max = Integer.MIN_VALUE;
        int index = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
                index = i;
            }
        }

        int left[] = new int[index];
        int right[] = new int[nums.length - index - 1];
        for (int i = 0; i < left.length; i++) {
            left[i] = nums[i];
        }
        for (int i = 0; i < right.length; i++) {
            right[i] = nums[index + 1 + i];
        }

        TreeNode root = new TreeNode(max);
        root.left = constructMaximumBinaryTree(left);
        root.right = constructMaximumBinaryTree(right);
        return root;
    }
}