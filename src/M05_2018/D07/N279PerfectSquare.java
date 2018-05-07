package M05_2018.D07;

public class N279PerfectSquare {
    public int numSquares(int n) {
        if (n <= 0)
            return 0;

        int[] f = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            f[i] = 1 + min(f, i);
        }
        return f[n];
    }

    private int min(int[] nums, int n){
        int sqrtN = (int)Math.sqrt(n);
        int res = nums[n - sqrtN * sqrtN];
        int cur;
        for (int i = sqrtN - 1; i >= 1; i--) {
            if ((cur = nums[n - i * i]) < res){
                res = cur;
            }
        }
        return res;
    }
}
