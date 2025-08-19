class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> arr = new ArrayList<>();
        int n = nums.length;
        // int sum = n*(n+1)/2;
        // Set<Integer> set = new HashSet<>();
        // for(int x: nums){
        //     set.add(x);
        // }
        // int i = 1;
        // while(i <= n){
        //     if(!set.contains(i))arr.add(i);
        //     i++;
        // }
        for(int i = 0; i < n; i++){
            int id = Math.abs(nums[i])-1;
            if(nums[id] > 0){
                nums[id] = -nums[id];
            }
        }
        for(int i = 0 ; i < n; i++){
            if(nums[i]>0){
                arr.add(i+1);
            }
        }
        return arr;
    }
}