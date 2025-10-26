class Solution {
    public int climbStairs(int n) {
        // int []dp = new int[n+1];
        // Arrays.fill(dp, -1);
        // dp[0]=1;
        // dp[1]=1;
        // for(int i = 2; i <= n; i++){
        //     dp[i] = dp[i-1]+dp[i-2];
        // }
        // return dp[n];
        int i = 1;
        int j = 1;
        int curr;
        for(int t =2; t <= n; t++){
            curr = i+j;
            i = j;
            j = curr;
        }
        return j;
    }
}