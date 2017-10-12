package Kevin_20170913_20171012;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class day025_2_BinaryTreeLevelOrderTraversal {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        Queue<TreeNode> queue = new ArrayDeque<>();
        if (root != null)queue.add(root);
        while (!queue.isEmpty()){
            int size = queue.size();
            List<Integer> level = new ArrayList<>(size);
            for (int i = 0; i < size; i++) {
                TreeNode current = queue.poll();
                level.add(current.val);
                if (current.left != null)queue.add(current.left);
                if (current.right != null)queue.add(current.right);
            }
            res.add(level);
        }
        return res;
    }
}
