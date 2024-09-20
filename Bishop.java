public class Bishop extends Piece{

    public Bishop(boolean white) {
        this.white = white;
        this.type = 3;
    }

    public String[] moves() {
        // {Direction Move, Maximum Place Moves, Capture Moves (optional)}
        String[] moves = {"NE SE SW NW", "8"};
        return moves;
    }
}
