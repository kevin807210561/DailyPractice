package M04_2018.D19;

public class UniquePath {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;

        int[][] f = new int[m + 1][n + 1];
        //initialize f
        for (int i = 0; i < m + 1; i++) {
            f[i][0] = 0;
        }
        for (int i = 0; i < n + 1; i++) {
            f[0][i] = 0;
        }
        f[1][0] = obstacleGrid[0][0] == 1 ? 0 : 1;
        //calculate f
        for (int i = 1; i < m + 1; i++) {
            for (int j = 1; j < n + 1; j++) {
                if (obstacleGrid[i - 1][j - 1] == 1){
                    f[i][j] = 0;
                }else {
                    f[i][j] = f[i - 1][j] + f[i][j - 1];
                }
            }
        }
        return f[m][n];
    }
}
