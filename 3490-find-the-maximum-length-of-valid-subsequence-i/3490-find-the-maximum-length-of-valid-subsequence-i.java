class Solution {
    public int maximumLength(int[] nums) {
        int len = 0;
        int [][] dp = new int[2][2];
        for(int n : nums){
            int parity = n % 2;
            for(int i = 0; i < 2; i++){
                dp[parity][i] = dp[i][parity] + 1;
                len = Math.max(len, dp[parity][i]);
            }
        }
        return len;
    }
}