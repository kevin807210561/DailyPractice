package Kevin_20170913_20171012;

import java.util.ArrayDeque;
import java.util.Queue;

public class day020_2_FindBottomLeftTreeValue {
    //①改进获取树的每一层节点个数的方法
    //②可以每层从右向左遍历，这样遍历到最后一个节点即为目标节点
    //③递归
    public int findBottomLeftValue(TreeNode root) {
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);
        int length = 1, nextLength = 0, res = 0;
        while(!queue.isEmpty()){
            nextLength = 0;
            res = queue.peek().val;
            for (int i = 0; i < length; i++) {
                TreeNode current = queue.peek();
                if (current.left != null){
                    queue.add(current.left);
                    nextLength++;
                }
                if (current.right != null){
                    queue.add(current.right);
                    nextLength++;
                }
                queue.remove();
            }
            length = nextLength;
        }
        return res;
    }
}
