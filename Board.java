public class Board {
    private char[][] board = new char[8][8];

    public Board() {
        board = new char[8][8];
    }

    public void printBoard() {
        for (int i = 0; i < board.length; i ++) {
            for(int j = 0; j < board[1].length; j ++) {
                System.out.printf("|%2s|", board[i][j]);
            }
            System.out.println();
        }
    }
}