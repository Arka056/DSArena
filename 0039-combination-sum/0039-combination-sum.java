class Solution {
    Set<List<Integer>> set;
    public void combSum(int []arr, int i, List<Integer> comb, List<List<Integer>> ans,int t){
        int n = arr.length;
        if(t < 0)return;
        if(t == 0){
            if(set.add(new ArrayList<>(comb)))
            {
            ans.add(new ArrayList<>(comb));
            }
            return;
        }
        if(i == n) return;
        comb.add(arr[i]);
        // combSum(arr, i+1, comb, ans, t-arr[i]);
        combSum(arr, i, comb, ans, t-arr[i]);
        comb.remove(comb.size()-1);
        combSum(arr, i+1, comb, ans, t);
    }
    public List<List<Integer>> combinationSum(int[] arr, int t) {
        List<List<Integer>> list = new ArrayList<>();
        set = new HashSet<>();
        combSum(arr, 0,  new ArrayList<>(), list, t);
        return list;
    }
}