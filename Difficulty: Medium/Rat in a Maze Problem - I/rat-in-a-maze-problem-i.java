class Solution {
    public void helper(int [][] mat, int r, int c, String path,
     ArrayList<String> ans, boolean [][]visited){

        int n = mat.length;
        if(r < 0 || c < 0 || r >= n || c >= n || mat[r][c] == 0 || visited[r][c] == true)return;
        if(r == n-1 && c == n-1){
            ans.add(path);
            return;
        }
        visited[r][c] = true;

        // Downward movement
        helper(mat, r+1, c, path +"D", ans, visited);

   // Leftward movement
        helper(mat, r, c-1, path +"L", ans, visited);
        // Rightward movement
        helper(mat, r, c+1, path +"R", ans, visited);

     

        // Upward movement
        helper(mat, r-1, c, path +"U", ans, visited);

        visited[r][c] = false; // To make the path not visited for newer path 

    }
    public ArrayList<String> ratInMaze(int[][] mat) {
        ArrayList<String> ans = new ArrayList<>();
        String path = "";
        boolean [][]visited = new boolean[mat.length][mat.length];
        for(int i = 0; i < mat.length; i++){
            Arrays.fill(visited[i], false);
        }
        helper(mat, 0, 0, path, ans, visited);
        return ans;
    }
}