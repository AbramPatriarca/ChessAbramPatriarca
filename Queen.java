public class Queen extends Piece{

    public Queen(boolean white) {
        this.white = white;
        this.type = 4;
    }

    public String[] moves() {
        // {Direction Move, Maximum Place Moves, Capture Moves (optional)}
        String[] moves = {"N NE E SE S SW W NW", "8"};
        return moves;
    }
}
