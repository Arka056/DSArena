class Solution {
    public int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums);
        long total = 0;
        int l = 0;
        long ans = 1;
        for(int r = 0; r < nums.length; r++){
            total += nums[r];
            long windowSize = r - l + 1L;
            while((long) ((nums[r]* windowSize)-total)> k){
                total -= nums[l];
                l++;
                windowSize = r - l + 1L;
            }
            ans = Math.max(ans, windowSize);
        }
        return (int) ans;
    }
}