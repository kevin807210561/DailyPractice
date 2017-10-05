public class day010_1_invertTree {
    //尝试非递归解决
    public TreeNode invertTree(TreeNode root) {
        if (root != null){
            TreeNode tempNode = root.left;
            root.left = root.right;
            root.right = tempNode;
            invertTree(root.left);
            invertTree(root.right);
        }
        return root;
    }
}
