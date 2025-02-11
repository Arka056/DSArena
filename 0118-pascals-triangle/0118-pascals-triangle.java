class Solution {
    public List<List<Integer>> generate(int n) {
        List<List<Integer>> mat = new ArrayList<>();
        for(int i = 0; i < n; i++){
            List<Integer> arr = new ArrayList<>();
            for(int j = 0; j <= i; j++){
                if(j == 0 || i == j){
                    arr.add(1);
                }
                else 
                arr.add(mat.get(i-1).get(j-1)+ mat.get(i - 1).get(j));
            }
            mat.add(arr);
        }
        return mat;
    }
}