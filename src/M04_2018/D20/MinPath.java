package M04_2018.D20;

public class MinPath {
    public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        int[][] f = new int[m + 1][n + 1];
        //initialize f
        for (int i = 0; i < m + 1; i++) {
            f[i][0] = Integer.MAX_VALUE;
        }
        for (int i = 0; i < n + 1; i++) {
            f[0][i] = Integer.MAX_VALUE;
        }
        f[0][1] = 0;
        //calculate f
        for (int i = 1; i < m + 1; i++) {
            for (int j = 1; j < n + 1; j++) {
                f[i][j] = Math.min(f[i - 1][j], f[i][j - 1]) + grid[i - 1][j - 1];
            }
        }
        return f[m][n];
    }
}
