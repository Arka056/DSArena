class Solution {
    public double new21Game(int N, int K, int W) {
        if (K == 0 || N >= K - 1 + W) return 1.0;

        double[] dp = new double[N + 1];
        double sum = 0.0;

        // Base case: K <= x <= N => dp[x] = 1
        for (int x = K; x <= N; x++) {
            dp[x] = 1.0;
            sum += dp[x];
        }

        // Fill dp from K-1 down to 0
        for (int x = K - 1; x >= 0; x--) {
            dp[x] = sum / W;
            sum += dp[x];
            if (x + W < dp.length) {
                sum -= dp[x + W];
            }
        }

        return dp[0];
    }
}
