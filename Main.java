import java.util.*;
public class Main {
    
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        Board board = new Board();
        board.printBoard();
        String userIn = input.nextLine();
        while (!userIn.equalsIgnoreCase("quit")) {
            Scanner parser = new Scanner(userIn);
            board.movePiece(parser.next(), parser.next());
            board.printBoard();
            userIn = input.nextLine();
        }
    }
}