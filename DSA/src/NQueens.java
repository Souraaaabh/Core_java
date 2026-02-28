import java.util.ArrayList;
import java.util.List;





public class NQueens {

    public static void helperPLacingQ(char[][] board, List<List<String>> allBoards, int col) {

            if (col == board.length) {
                saveBoard(board, allBoards);
                return;
            }
            for (int row = 0; row < board.length; row++){
            if (isSafe(row, col, board)) {
                board[row][col] = 'Q';
                helperPLacingQ(board, allBoards, col + 1);
                board[row][col] = '.';
            }
        }
    }


    public static boolean isSafe(int row, int col, char[][] board) {
        //horizontal check
        for (int i = 0; i < board.length; i++) {
            if (board[row][i] == 'Q') {
                return false;
            }
        }
        //vertical check
        for (int j = 0; j < board[0].length; j++) {
            if (board[j][col] == 'Q'){
                return false;

            }
        }
        //Upper left
        int r = row;
        for (int c = col; c >= 0 && r >= 0; c--, r--) {
            if (board[r][c] == 'Q') {
                return false;
            }
        }


//            upper right
        r = row;
        for (int c = col; r >= 0 && c < board.length; r--, c++) {
            if (board[r][c] == 'Q') {
                return false;
            }
        }
//            Lower right
        r = row;
        for (int c = col; c < board.length && r < board.length; c++, r++) {
            if (board[r][c] == 'Q') {
                return false;
            }
        }
//                lower left
        r = row;
        for (int c = col; c >= 0 && r < board.length; c--, r++) {
            if (board[r][c] == 'Q') {
                return false;
                }

            }
        return true;
    }



    public static void saveBoard(char[][] board, List<List<String>> allBoards) {
        StringBuilder row = new StringBuilder();
        List<String> newBoard  =new ArrayList<>();
        for(int i = 0; i < board.length; i++) {
            row = new StringBuilder();
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j]=='Q')
                    row.append('Q');
                else
                    row.append('.');
                
            }
            newBoard.add(row.toString());
            
        }
        allBoards.add(newBoard);
        
    }
    public static List<List<String>> solveNQueens(int n) {
        List<List<String>> allBoards = new ArrayList<>();
        char[][] board = new char[n][n];
        helperPLacingQ(board,allBoards,0);
        return allBoards;
    }

    public static void main(String[] args) {
        int n = 4;
        System.out.println(solveNQueens(n));
    }
}