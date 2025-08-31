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
    public void nQueens(List<List<String>> ans, char [][] board, int row, int n){
        if (row == n) {
    List<String> solution = new ArrayList<>();
    for (char[] r : board) {
        solution.add(new String(r)); // convert entire row to string
    }
    ans.add(solution);
    return;
}


        for(int i = 0; i < n; i++){
            if(isSafe(board, row, i, n)){
                board[row][i] = 'Q';
                nQueens(ans, board, row+1, n);
                board[row][i] = '.';
            }
        }
    }
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ans = new ArrayList<>();
        char [][] board = new char[n][n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j< n; j++){
                board[i][j] = '.';
            }
        }
        nQueens(ans, board, 0, n);
        return ans;
    }
}