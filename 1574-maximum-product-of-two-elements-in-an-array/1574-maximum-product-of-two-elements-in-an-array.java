class Solution {
    public int maxProduct(int[] nums) {
        // Arrays.sort(nums);
        // int x = nums[nums.length -1]-1;
        // int y = nums[nums.length-2]-1;
        // return x * y;
        int max = Integer.MIN_VALUE;
        int secMax = Integer.MIN_VALUE;
        int n = nums.length;
        for(int i = 0; i < n; i++){
            if(max < nums[i]){
                secMax = max;
                max = nums[i];
            }
            else if(secMax < nums[i]){
                secMax = nums[i];
            }
        }
        return (max-1)*(secMax-1);
    }
}