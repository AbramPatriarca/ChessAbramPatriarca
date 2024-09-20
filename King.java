public class King extends Piece{

    public King(boolean white) {
        this.white = white;
        this.type = 5;
    }
    
    public String[] moves() {
        // {Direction Move, Maximum Place Moves, Capture Moves (optional)}
        String[] moves = {"N NE E SE S SW W NW", "1"};
        return moves;
    }

}
