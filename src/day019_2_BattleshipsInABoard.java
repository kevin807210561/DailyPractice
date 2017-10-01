public class day019_2_BattleshipsInABoard {
    public int countBattleships(char[][] board) {
        int res = 0;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == 'X' && (j - 1 < 0 || board[i][j - 1] == '.') && (i - 1 < 0 || board[i - 1][j] == '.')){
                    res++;
                }
            }
        }
        return res;
    }
}
