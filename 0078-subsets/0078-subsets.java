class Solution {
    public List<List<Integer>> findSubSets(int [] arr, List<Integer> b, int i, List<List<Integer>> ans){
        if(i == arr.length){
            ans.add(new ArrayList<>(b));
            return ans;
        }
        b.add(arr[i]);
        findSubSets(arr, b, i+1, ans);
        b.remove(b.size()-1);
        return findSubSets(arr, b, i+1, ans);
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        // int set = 1 << nums.length;
        // for(int i = 0; i < set; i++){
        //     List<Integer> l = new ArrayList<>();
        //     for(int j = 0; j < nums.length; j++){
        //         if((i & (1 << j)) != 0){
        //             l.add(nums[j]);
        //         }
        //     }
        //     ans.add(l);
        // }
        findSubSets(nums, new ArrayList<>(), 0, ans);
        return ans;
    }
}