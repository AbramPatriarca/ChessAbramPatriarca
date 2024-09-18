import java.util.*;
public class Main {

    static char[][] board = new char[8][8];
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        Board board = new Board();
        board.printBoard();
    }
}