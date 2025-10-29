class Solution {
    public void rotate(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int x = Math.max(m, n);
        // int prev, curr;
        // while(row < m && col < n){
        //     if(row + 1 == m || col+1 == n)break;
        //     prev = mat[row+2][col];
        //     for(int i = col; i < n; i++){
        //         curr = mat[row][i];
        //         mat[row][i] = prev;
        //         prev = curr;
        //     }
        //     row++;

        // }
        for(int i = 0; i < n; i++){
            for(int j = i+1; j < n; j++){
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }
        for(int i = 0; i < n; i++){
            int l = 0, r = n-1;
            while(l < r){
                int temp = mat[i][l];
                mat[i][l] = mat[i][r];
                mat[i][r] = temp;
                l++;
                r--;
            }
        }
    }
}