public class day026_2_TeemoAttacking {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int res = 0;
        for (int i = 0; i < timeSeries.length - 1; i++) {
            res += timeSeries[i + 1] - timeSeries[i] >= duration ? duration : timeSeries[i + 1] - timeSeries[i];
        }
        return timeSeries.length == 0 ? 0 : res + duration;
    }
}
