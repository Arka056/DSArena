class Solution {
    public boolean searchMatrix(int[][] m, int t) {
        for(int i = 0; i < m.length; i++){
            for(int j = 0; j < m[i].length; j++){
                if(m[i][j] == t) return true;
            }
        }
        return false;
    }
}