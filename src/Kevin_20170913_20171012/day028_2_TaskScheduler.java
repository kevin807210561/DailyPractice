package Kevin_20170913_20171012;

import java.util.Arrays;

public class day028_2_TaskScheduler {
    public int leastInterval(char[] tasks, int n) {
        int[] counts = new int[26];
        Arrays.fill(counts, 0);
        for (char task: tasks) {
            counts[task - 'A']++;
        }

        int types = 0;
        int total = 0;
        int max = 0;
        int maxCount = 0;
        for (int count : counts) {
            if (count != 0) {
                types++;
                total += count;
                if (count > max) {
                    max = count;
                    maxCount = 0;
                }

            }
        }

        if (types <= (n + 1) || total <= (n + 1) * max) return max + (max - 1) * n;
        return total;
    }
}
