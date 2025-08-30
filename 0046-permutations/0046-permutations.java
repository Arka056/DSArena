class Solution {
    public void swap(int [] a, int i, int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
     }
    public void findPermutations(int [] arr, int i, List<List<Integer>> ans){
        if(i == arr.length){
            List<Integer> b = new ArrayList<>();
            for(int n : arr){
                b.add(n);
            }
            ans.add(b);
            return;
        }
        for(int j = i; j < arr.length; j++){
            swap(arr, j, i);
            findPermutations(arr, i+1, ans);
            swap(arr, j, i); // backtrack
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        findPermutations(nums, 0, ans);
        return ans;
    }
}