import java.util.Arrays;

public class day028_2_TaskScheduler {
    public int leastInterval(char[] tasks, int n) {
        int[] counts = new int[26];
        Arrays.fill(counts, 0);
        for (char task: tasks) {
            counts[task - 'A']++;
        }
    }
}
