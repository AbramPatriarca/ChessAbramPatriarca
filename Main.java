import java.util.*;
public class Main {

    static char[][] board = new char[8][8];
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        printBoard();
    }

    public static void updateBoard() {
        String userInput;
    }

    public static void printBoard() {
        for (int i = 0; i < board.length; i ++) {
            System.out.println(Arrays.toString(board[i]));
        }
    }
    public static boolean possibleMove(String[] moves, String color) {
        
    }
}