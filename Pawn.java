public class Pawn extends Piece{

    public Pawn(boolean white) {
        this.white = white;
        this.type = 0;
    }

    public String[] moves() {
        // {Direction Move, Maximum Place Moves, Capture Moves (optional)}
        String[] moves = {"N", "1", "NE NW"};
        return moves;
    }

}
