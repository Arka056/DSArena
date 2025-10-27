class Solution {
    public int maxProfit(int[] p) {
        int maxP = 0;
        for(int i = 1; i < p.length; i++){
            // Checking if the next day price is better, we sell
            if(p[i] > p[i-1]){
                maxP += p[i] - p[i-1];
            }
        }
        return maxP;
    }
}