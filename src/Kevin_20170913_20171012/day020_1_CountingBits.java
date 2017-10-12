package Kevin_20170913_20171012;

public class day020_1_CountingBits {
    //An easy recurrence for this problem is f[i] = f[i / 2] + i % 2.
    public int[] countBits(int num) {
        int[] res = new int[num + 1];
        res[0] = 0;
        for (int i = 0; i <= Math.log(num) / Math.log(2); i++) {
            int begin = (int) Math.pow(2, i);
            for (int j = begin; j < Math.pow(2, i + 1) && j <= num; j++) {
                res[j] = 1 + res[j - begin];
            }
        }
        return res;
    }
}
