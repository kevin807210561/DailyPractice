import java.util.ArrayList;
import java.util.List;

public class day007_2_averageOfLevels {
    //尝试不用递归去解决
    public List<Double> averageOfLevels(TreeNode root) {
        List<TreeNode> roots = new ArrayList<>(1);
        roots.add(root);
        return averageOfLevels(roots);
    }

    public List<Double> averageOfLevels(List<TreeNode> roots) {
        //终止条件
        boolean flag = true;
        for (TreeNode root : roots) {
            if (root != null){
                flag = false;
                break;
            }
        }
        if (flag){
            return new ArrayList<>();
        }

        //计算树根的平均值并且收集下一层的树根
        long sum = 0;
        long counter = 0;
        List<TreeNode> nextLevelRoots = new ArrayList<>();
        for (TreeNode root : roots) {
            if (root != null){
                sum += root.val;
                counter++;
                if (root.left != null) nextLevelRoots.add(root.left);
                if (root.right != null)nextLevelRoots.add(root.right);
            }
        }

        //递归
        List<Double> res = new ArrayList<>();
        res.add((double)sum / counter);
        for (double num : averageOfLevels(nextLevelRoots)) {
            res.add(num);
        }
        return res;
    }
}
