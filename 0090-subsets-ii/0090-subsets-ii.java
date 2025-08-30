class Solution {
    public List<List<Integer>> findSubSets(int [] arr, List<Integer> b, int i, List<List<Integer>> ans){
        if(i == arr.length){
            ans.add(new ArrayList<>(b));
            return ans;
        }
        b.add(arr[i]);
        findSubSets(arr, b, i+1, ans);
        b.remove(b.size()-1);
        int idx = i+1;
        while(idx < arr.length && arr[idx] == arr[idx-1]) idx++;
        return findSubSets(arr, b, idx, ans);
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        findSubSets(nums, new ArrayList<>(), 0, ans);
        return ans;
    }
}