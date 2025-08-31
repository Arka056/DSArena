class Solution {
    public boolean isSafe(char[][] board, int row, int col, int dig){
        char c = (char)(dig + '0');
        // Horizontally check 
        for(int i = 0; i < 9; i++){
            if(board[row][i] == dig) return false;
        }

        // Vertically check
        for(int i = 0; i < 9; i++){
            if(board[i][col] == dig) return false;
        }
    
        // grid check
        int sRow = (row/3)*3;
        int sCol = (col/3)*3;
        for(int i = sRow; i < sRow+3; i++){
            for(int j = sCol; j < sCol+3; j++){
                if(board[i][j] == dig) return false;
            }
        }
        return true;
    }
    public boolean fun(char [][] board, int row, int col){
        if(row == 9){
            return true;
        }
        int newRow = row;
        int newCol = col+1;
        if(newCol == 9){
            newRow = row+1;
            newCol = 0;
        }

        if(board[row][col] != '.'){
            return fun(board, newRow, newCol);
        }

       for (char c = '1'; c <= '9'; c++) {   // loop over chars not ints
            if (isSafe(board, row, col, c)) {
                board[row][col] = c;          // place digit
                if (fun(board, newRow, newCol)) return true;
                board[row][col] = '.';        // backtrack
            }
        }
        return false;
    }
    public void solveSudoku(char[][] board) {
        fun(board, 0, 0);
    }
}