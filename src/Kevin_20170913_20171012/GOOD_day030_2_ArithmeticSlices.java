package Kevin_20170913_20171012;

public class GOOD_day030_2_ArithmeticSlices {
    //有时间复杂度为O(n)的算法
    public int numberOfArithmeticSlices(int[] A) {
        int res = 0;
        for (int i = 0; i <= A.length - 3; i++) {
            for (int j = 0; i + 2 + j < A.length && A[i] - A[i + 1] == A[i + 1 + j] - A[i + 2 + j]; j++) {
                res++;
            }
        }
        return res;
    }
}
