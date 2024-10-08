// Creates layout for all pieces on the board 
public abstract class Piece {

    public boolean white;
    public String name;
    public int type;

    String[] blackPieces = {"♙", "♖", "♘", "♗", "♕", "♔"};
    String[] whitePieces = {"♟", "♜", "♞", "♝", "♛", "♚"};

    public Piece() {

    }

    public Piece(boolean white) {
        this.white = white;
        this.type = 0;
    }
    
    public abstract String[] moves();

    // Returns the properly cased character for black or white
    public String toString() {
        if(white) {
            return whitePieces[type];
        }
        return blackPieces[type];
    }
    
}