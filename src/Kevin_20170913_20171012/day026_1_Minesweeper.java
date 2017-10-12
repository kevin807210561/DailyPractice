package Kevin_20170913_20171012;

public class day026_1_Minesweeper {
    public char[][] updateBoard(char[][] board, int[] click) {
        switch (board[click[0]][click[1]]) {
            case 'M':
                board[click[0]][click[1]] = 'X';
                break;
            case 'E':
                revealE(board, click[0], click[1]);
                break;
        }
        return board;
    }

    private void revealE(char[][] board, int x, int y) {
        int count = countAdjacentMines(board, x, y);
        if (count != 0) {
            board[x][y] = (char) (count + '0');
        } else {
            board[x][y] = 'B';
            if (canReveal(board, x, y - 1)) revealE(board, x, y - 1);
            if (canReveal(board, x, y + 1)) revealE(board, x, y + 1);
            if (canReveal(board, x - 1, y - 1)) revealE(board, x - 1, y - 1);
            if (canReveal(board, x - 1, y)) revealE(board, x - 1, y);
            if (canReveal(board, x - 1, y + 1)) revealE(board, x - 1,y + 1);
            if (canReveal(board, x + 1, y - 1)) revealE(board, x + 1, y - 1);
            if (canReveal(board, x + 1, y)) revealE(board, x + 1, y);
            if (canReveal(board, x + 1, y + 1)) revealE(board, x + 1, y + 1);
        }
    }

    private boolean canReveal(char[][] board, int x, int y){
        int rows = board.length;
        int columns = board[0].length;
        return 0 <= x && x < rows && 0 <= y && y < columns && board[x][y] != 'B'; //这里要判断board[x][y] != 'B'，否则会无限循环
    }

    private int countAdjacentMines(char[][] board, int x, int y) {
        int rows = board.length;
        int columns = board[0].length;
        return (((y - 1 >= 0) && (board[x][y - 1] == 'M')) ? 1 : 0) +
                (((x - 1 >= 0) && (board[x - 1][y] == 'M')) ? 1 : 0) +
                (((y + 1 < columns) && (board[x][y + 1] == 'M')) ? 1 : 0) +
                (((x + 1 < rows) && (board[x + 1][y] == 'M')) ? 1 : 0) +
                (((x - 1 >= 0) && (y - 1 >= 0) && (board[x - 1][y - 1] == 'M')) ? 1 : 0) +
                (((y + 1 < columns) && (x - 1 >= 0) && (board[x - 1][y + 1] == 'M')) ? 1 : 0) +
                (((x + 1 < rows) && (y - 1 >= 0) && (board[x + 1][y - 1] == 'M')) ? 1 : 0) +
                (((x + 1 < rows) && (y + 1 < columns) && (board[x + 1][y + 1] == 'M')) ? 1 : 0);
    }
}
