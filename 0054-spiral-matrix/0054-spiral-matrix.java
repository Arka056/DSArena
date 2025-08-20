class Solution {
    public List<Integer> spiralOrder(int[][] mat) {
        List<Integer> list = new ArrayList<>();
        if(mat.length==0)return list;
        int top = 0, left = 0, right = mat[0].length-1, bottom = mat.length-1;

        while(top <= bottom && left <= right){

            //left -> right
            for(int i = left; i <= right; i++){
                list.add(mat[top][i]);
            }
            top++;

            //right->bottom
            for(int i = top; i <= bottom; i++){
                list.add(mat[i][right]);
            }
            right--;

            // bottom->left
            if(top <= bottom){
                for(int i = right; i >= left; i--){
                    list.add(mat[bottom][i]);
                }
                bottom--;
            }

            // left->upwards
            if(left <= right){
                for(int i = bottom; i >= top; i--){
                    list.add(mat[i][left]);
                }
                left++;
            }
        }
        return list;
    }
}