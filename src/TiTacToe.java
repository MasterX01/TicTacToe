public class TiTacToe {
    // UC-1
    char[] board = new char[10];
    public void makeEmpty() {
        for (int i = 1; i < board.length; i++) {
            board[i] = (char) ' ';
        }
    }

    public static void main(String[] args){
        TiTacToe obj = new TiTacToe();
        obj.makeEmpty();
    }
}
