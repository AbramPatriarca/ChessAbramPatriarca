public class Rook extends Piece{

    public Rook(boolean white) {
        this.white = white;
        this.type = 1;
    }

    public String[] moves() {
        // {Direction Move, Maximum Place Moves, Capture Moves (optional)}
        String[] moves = {"N E S W", "8"};
        return moves;
    }

}
