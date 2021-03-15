import java.util.Scanner;

public class TiTacToe {
    // UC-2
    static char[] board = new char[10];
    public static char player;
    public static char computer;

    public static void makeEmpty() {
        for (int i = 1; i < board.length; i++) {
            board[i] = ' ';
        }
    }

    public static void playerSelect() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the Symbol you choose to with (X/O): ");
        String choice = scan.next();
        switch(choice) {
            case "X":
                player = 'X';
                computer = 'O';
                break;
            case "O":
                player = 'O';
                computer = 'X';
                break;
            default:
                System.out.println("Invalid choice");
                break;
        }
    }


    public static void showBoard() {
        System.out.println("Currently the Board Looks Like ");
        System.out.println(" ");
        System.out.println("\n "+ board[1] + " | "+ board[2] + " | " + board[3]);
        System.out.println("-----------");
        System.out.println(" "+ board[4] + " | " + board[5] + " | " + board[6]);
        System.out.println("-----------");
        System.out.println(" "+ board[7] + " | " + board[8] + " | " + board[9]);
        System.out.println(" ");
    }

    public static void main(String[] args) {
        makeEmpty();
        playerSelect();
        showBoard();
        
    }
}
