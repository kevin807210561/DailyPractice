public class day012_1_tree2str {
    public String tree2str(TreeNode t) {
        if (t == null) return "";

        StringBuilder res = new StringBuilder();
        res.append(t.val);
        if(t.left != null && t.right == null){
            res.append("(");
            res.append(tree2str(t.left));
            res.append(")");
        }else if (t.left == null && t.right != null){
            res.append("()");
            res.append("(");
            res.append(tree2str(t.right));
            res.append(")");
        }else if (t.left != null && t.right != null){
            res.append("(");
            res.append(tree2str(t.left));
            res.append(")");
            res.append("(");
            res.append(tree2str(t.right));
            res.append(")");
        }
        return res.toString();
    }
}
