package Kevin_20170913_20171012;

public class GOOD_day013_1_maxCount {
    public int maxCount(int m, int n, int[][] ops) {
        int[] min = {m, n};
        for (int[] range : ops) {
            if (range[0] < min[0]) min[0] = range[0];
            if (range[1] < min[1]) min[1] = range[1];
        }
        return min[0] * min[1];
    }

    public int maxCount1(int m, int n, int[][] ops) {
        //在这里会出现超过内存限制的问题，当m = 40000，n = 40000时，需要的空间是40000 * 40000，太大了
        int[][] matrix = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = 0;
            }
        }

        //执行操作
        for (int[] range : ops) {
            for (int i = 0; i < range[0]; i++) {
                for (int j = 0; j < range[1]; j++) {
                    matrix[i][j] += 1;
                }
            }
        }

        //找出最大数以及最大数出现的次数
        int max = 0;
        int maxCount = 0;
        for (int[] row : matrix) {
            for (int num : row) {
                if (num == max) maxCount++;
                if (num > max){
                    max = num;
                    maxCount = 1;
                }
            }
        }

        return maxCount;
    }
}
