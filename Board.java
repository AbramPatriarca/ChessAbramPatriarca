public class Board {

    // Initializes array of pieces and alphabet array for locating pieces
    private Piece[][] board = new Piece[8][8];
    public static String[] alphabet = {"A", "B", "C", "D", "E", "F", "G", "H"};

    // Constructor for creating a new board
    public Board() {
        board = new Piece[8][8];
        this.resetBoard();
    }

    // Places the pieces in their starting position 
    public void resetBoard() {

        // Placing Pawns
        // Loops each row
        for (int i = 1; i < 8; i += 5) {

            // Loops each piece in each row
            for (int j = 0; j < 8; j ++) {

                // Decides whether or not to place a white or black piece 
                if (i == 6) {
                    board[i][j] = new Pawn(true);
                } else {
                    board[i][j] = new Pawn(false);
                }
            }
        }

        // Placing Rooks
        for (int i = 0; i < 8; i += 7) {
            for (int j = 0; j < 8; j += 7) {
                if (i == 0) {
                    board[i][j] = new Rook(false);
                } else {
                    board[i][j] = new Rook(true);
                }
            }
        }

        // Placing Knights
        for (int i = 0; i < 8; i += 7) {
            for (int j = 1; j < 8; j += 5) {
                if (i == 0) {
                    board[i][j] = new Knight(false);
                } else {
                    board[i][j] = new Knight(true);
                }
            }
        }

        // Placing Bishop
        for (int i = 0; i < 8; i += 7) {
            for (int j = 2; j < 8; j += 3) {
                if (i == 0) {
                    board[i][j] = new Bishop(false);
                } else {
                    board[i][j] = new Bishop(true);
                }
            }
        }

        // Placing Queens
        board[0][3] = new Queen(false);
        board[7][3] = new Queen(true);

        // Placing Kings
        board[0][4] = new King(false);
        board[7][4] = new King(true);

        // Placing Pawns
        for(int i = 0; i < 8; i ++) {
            board[1][i] = new Pawn (false);
        }
        for(int i = 0; i < 8; i ++) {
            board[6][i] = new Pawn (true);
        }
        

    }

    // Prints the board array items with lines for separation 
    public void printBoard() {

        // Loops the rows
        for (int i = 0; i < board.length; i ++) {

            // Prints the letter for each row, then loops each square in each row 
            System.out.print(alphabet[7-i]);
            for(int j = 0; j < board[1].length; j ++) {
                if (board[i][j] != null) {
                    System.out.printf("| %s ", board[i][j].toString());
                } else {
                    System.out.printf("|%3s", " ");
                }
            }
            System.out.print("|");
            System.out.println();
        }
        System.out.print(" ");
        for (int x = 1; x <= 8; x ++) {
            System.out.printf("  %s ", x);
        } 
    }

    public void movePiece(String start, String end) {
        Piece temp = board[toInt(start.substring(0,1))][Integer.parseInt(start.substring(1)) - 1];
        board[toInt(start.substring(0,1))][Integer.parseInt(start.substring(1)) - 1] = null;
        board[toInt(end.substring(0,1))][Integer.parseInt(end.substring(1)) - 1] = temp;
    }

    public static int toInt(String letter) {
        for (int i = 0; i < 8; i ++) {
            if (letter.equalsIgnoreCase(alphabet[7-i])) {
                return i;
            }
        }
        return 0;
    }
}