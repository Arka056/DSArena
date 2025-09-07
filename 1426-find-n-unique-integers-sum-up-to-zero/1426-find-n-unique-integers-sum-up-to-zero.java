class Solution {
    public int[] sumZero(int n) {
        if(n == 1)return new int[]{0};
        if(n == 3)return new int[] {-1, 0, 1};
        int [] ans = new int[n];
        int c = 0;
        for(int i = 1; i <= n/2; i++){
            ans[c++] = -i;
            ans[c++] = i;
        }
        if(n % 2 == 1) ans[c] = 0;
        return ans;
    }
}