package M04_2018.D27;

import java.util.ArrayList;
import java.util.List;

public class UniqueBST {
    public List<TreeNode> generateTrees(int n) {
        if (n < 1) return new ArrayList<>();
        return generateTreesHelper(1, n);
    }

    private List<TreeNode> generateTreesHelper(int start, int end){
        if (start >= end){
            List<TreeNode> trees = new ArrayList<>(1);
            trees.add(start == end ? new TreeNode(start) : null);
            return trees;
        }

        List<TreeNode> trees = new ArrayList<>();
        List<TreeNode> leftSubTrees;
        List<TreeNode> rightSubTrees;
        for (int i = start; i <= end; i++) {
            leftSubTrees = generateTreesHelper(start, i - 1);
            rightSubTrees = generateTreesHelper(i + 1, end);
            for (int j = 0; j < leftSubTrees.size(); j++) {
                for (int k = 0; k < rightSubTrees.size(); k++) {
                    TreeNode tree = new TreeNode(i);
                    tree.left = leftSubTrees.get(j);
                    tree.right = rightSubTrees.get(k);
                    trees.add(tree);
                }
            }
        }
        return trees;
    }
}
