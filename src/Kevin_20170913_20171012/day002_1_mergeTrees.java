package Kevin_20170913_20171012;

public class day002_1_mergeTrees {
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if (t1 == null && t2 == null)
            return null;

        TreeNode res;
        if (t1 == null) {
            res = new TreeNode(t2.val);
            res.left = mergeTrees(null, t2.left);
            res.right = mergeTrees(null, t2.right);
        } else if (t2 == null) {
            res = new TreeNode(t1.val);
            res.left = mergeTrees(t1.left, null);
            res.right = mergeTrees(t1.right, null);
        } else {
            res = new TreeNode(t1.val + t2.val);
            res.left = mergeTrees( t1.left, t2.left);
            res.right = mergeTrees(t1.right, t2.right);
        }
        return res;
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}