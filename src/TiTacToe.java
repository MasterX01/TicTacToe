public class TiTacToe {
    // UC-1
    char[] board = new char[10];
    public static void makeEmpty() {
        for (int i = 1; i < board.length; i++) {
            board[i] = ' ';
        }
    }

    public static void main(String[] args){
        makeEmpty();
    }
}
