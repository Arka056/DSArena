class Solution {
    public int majorityElement(int[] nums) {
        // int n = nums.length;
        // Arrays.sort(nums);
        // return nums[n/2];

        int count = 0, candidate = 0;
        for(int x : nums){
            if(count == 0){
                candidate = x;
            }
            count += (candidate == x) ? 1 : -1;
        }
        return candidate;
    }
}