package M04_2018.D28;

import java.util.Arrays;
import java.util.List;

public class MinSum {
    public int minimumTotal(List<List<Integer>> triangle) {
        //dynamic programming
        int[] minimumTotals = new int[triangle.size() + 1];
        Arrays.fill(minimumTotals, Integer.MAX_VALUE);
        minimumTotals[1] = triangle.get(0).get(0);
        for (int i = 1; i < triangle.size(); i++) {
            for (int j = i + 1; j > 0; j--) {
                minimumTotals[j] = Math.min(minimumTotals[j - 1], minimumTotals[j]) + triangle.get(i).get(j - 1);
            }
        }

        //find the minimum total
        int res = Integer.MAX_VALUE;
        int cur;
        for (int i = 0; i < minimumTotals.length; i++) {
            if((cur = minimumTotals[i]) < res){
                res = cur;
            }
        }
        return res;
    }
}
