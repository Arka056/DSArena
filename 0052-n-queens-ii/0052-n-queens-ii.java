class Solution {
    public boolean isSafe(char [][] board, int row, int col, int n){

        // Horizontal check
        for(int i = 0; i < n; i++){
            if(board[row][i] == 'Q') return false;
        }

        // Vertical check
        for(int i = 0; i < n; i++){
            if(board[i][col] == 'Q') return false;
        }

        // Left Diagonal check
        for(int i = row, j = col; i >= 0 && j >= 0; i--, j--){
            if(board[i][j] == 'Q')return false;
        }

        // Right Diagonal check
        for(int i = row, j = col; i >= 0 && j < n; i--, j++){
            if(board[i][j] == 'Q')return false;
        }
        return true;
    }
    public int nQueens(List<List<String>> ans, char [][] board, int row, int n){
        int c = 0;
        if (row == n) {
           return 1;
        }

        for(int i = 0; i < n; i++){
            if(isSafe(board, row, i, n)){
                board[row][i] = 'Q';
                c += nQueens(ans, board, row+1, n);
                board[row][i] = '.'; // backtracked
            }
        }
        return c;
    }
    public int totalNQueens(int n) {
        List<List<String>> ans = new ArrayList<>();
        char [][] board = new char[n][n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j< n; j++){
                board[i][j] = '.';
            }
        }
        int t = nQueens(ans, board, 0, n);
        return t;
    }
}