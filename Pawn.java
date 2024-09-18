public class Pawn extends Piece{
    public String[] moves() {
        // {Direction Move, Maximum Place Moves, Capture Moves (optional)}
        String[] moves = {"N", "1", "NE NW"};
        return moves;
    }

    public char getType() {
        return 'p';
    }
}
