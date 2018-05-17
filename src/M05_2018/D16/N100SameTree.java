package M05_2018.D16;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class N100SameTree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        //p or q is null
        if (p == null || q == null){
            return p == null && q == null;
        }

        //p and q are not null
        Stack<TreeNode> stack1 = new Stack<>();
        Stack<TreeNode> stack2 = new Stack<>();
        Set<TreeNode> set = new HashSet<>();

        if (p.val != q.val){
            return false;
        }
        stack1.push(p);
        stack2.push(q);
        set.add(p);
        set.add(q);
        TreeNode treeNode1;
        TreeNode treeNode2;
        TreeNode treeNode1Left;
        TreeNode treeNode1Right;
        TreeNode treeNode2Left;
        TreeNode treeNode2Right;
        while (!stack1.empty()){
            treeNode1 = stack1.peek();
            treeNode2 = stack2.peek();
            treeNode1Left = treeNode1.left;
            treeNode1Right = treeNode1.right;
            treeNode2Left = treeNode2.left;
            treeNode2Right = treeNode2.right;

            if (treeNode1Left != null && !set.contains(treeNode1Left)){
                if(treeNode2Left == null || treeNode1Left.val != treeNode2Left.val){
                    return false;
                }
                stack1.push(treeNode1Left);
                stack2.push(treeNode2Left);
                set.add(treeNode1Left);
                set.add(treeNode2Left);
            }else if (treeNode1Right != null && !set.contains(treeNode1Right)){
                if (treeNode2Right == null || treeNode2Right.val != treeNode1Right.val){
                    return false;
                }
                stack1.push(treeNode1Right);
                stack2.push(treeNode2Right);
                set.add(treeNode1Right);
                set.add(treeNode2Right);
            }else {
                if ((treeNode1Left == null && treeNode2Left != null) || (treeNode1Right == null && treeNode2Right != null)){
                    return false;
                }
                stack1.pop();
                stack2.pop();
            }
        }

        return true;
    }
}
