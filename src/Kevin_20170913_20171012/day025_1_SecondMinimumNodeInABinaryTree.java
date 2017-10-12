package Kevin_20170913_20171012;

public class day025_1_SecondMinimumNodeInABinaryTree {
    public int findSecondMinimumValue(TreeNode root) {
        if (root != null){
            if (root.left != null) if (root.left.val > root.val) {
                int candidate = findSecondMinimumValue(root.right);
                return candidate == -1 ? root.left.val : Math.min(root.left.val, candidate);
            }
            if (root.right != null) if (root.right.val > root.val) {
                int candidate = findSecondMinimumValue(root.left);
                return candidate == -1 ? root.right.val : Math.min(root.right.val, candidate);
            }
            int candidate1 = findSecondMinimumValue(root.left);
            int candidate2 = findSecondMinimumValue(root.right);
            return candidate1 == -1 ? candidate2 : (candidate2 == -1 ? candidate1 : Math.min(candidate1, candidate2));
        }
        return -1;
    }
}
