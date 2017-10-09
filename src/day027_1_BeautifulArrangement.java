import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class day027_1_BeautifulArrangement {
    //排列递归过程尝试用swap
    private int res = 0;

    public int countArrangement(int N) {
        List<Integer>[] candidates = new List[N];
        for (int i = 0; i < N; i++) {
            candidates[i] = new ArrayList<>(N);
            for (int j = 1; j <= N; j++) {
                if (j % (i + 1) == 0 || (i + 1) % j == 0) candidates[i].add(j);
            }
        }

        int[] flags = new int[N];
        Arrays.fill(flags, 0);
        helper(candidates, 0, candidates.length, flags);
        return res;
    }

    private void helper(List<Integer>[] candidates, int start, int end, int[] flags){
        if (end - start == 0){
            res++;
        }else{
            List<Integer> firstSet = candidates[start];
            for (int i = 0; i < firstSet.size(); i++) {
                if (i != 0){
                    flags[firstSet.get(i - 1) - 1] -= 1;
                }

                if (flags[firstSet.get(i) - 1] > 0){
                    flags[firstSet.get(i) - 1] += 1;
                    continue;
                }

                flags[firstSet.get(i) - 1] += 1;
                helper(candidates, start + 1, end, flags);
            }
            flags[firstSet.get(firstSet.size() - 1) - 1] -= 1;
        }
    }
}
