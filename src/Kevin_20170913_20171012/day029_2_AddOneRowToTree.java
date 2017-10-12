package Kevin_20170913_20171012;

import java.util.ArrayDeque;
import java.util.Queue;

public class day029_2_AddOneRowToTree {
    public TreeNode addOneRow(TreeNode root, int v, int d) {
        //处理d为1的特殊情况
        if (d == 1){
            TreeNode newRoot = new TreeNode(v);
            newRoot.left = root;
            return newRoot;
        }

        //获取d-1层的所有节点
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);
        for (int i = 0; i < d - 2; i++) {
            int size = queue.size();
            for (int j = 0; j < size; j++) {
                TreeNode current = queue.peek();
                if (current.left != null) queue.add(current.left);
                if (current.right != null) queue.add(current.right);
                queue.remove();
            }
        }

        //增加新的一层
        while (!queue.isEmpty()){
            TreeNode current = queue.peek();
            TreeNode treeNode1 = new TreeNode(v);
            treeNode1.left = current.left;
            current.left = treeNode1;
            TreeNode treeNode2 = new TreeNode(v);
            treeNode2.right = current.right;
            current.right = treeNode2;
            queue.remove();
        }

        //返回结果
        return root;
    }
}
