class Solution {
    public int hIndex(int[] c) {
        int n = c.length;
        
        for(int i = 0; i < n; i++){
            int k = n-i;
            if(c[i] >= k) return k;
        }
        return 0;
    }
}