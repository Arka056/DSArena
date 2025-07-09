class Solution {
    public int maxProfit(int[] p) {
        int maxP = 0;
        for(int i = 1; i < p.length; i++){
            if(p[i] > p[i-1]){
                maxP += p[i] - p[i-1];
            }
        }
        return maxP;
    }
}