class Solution {
    public int totalMoney(int n) {
        int weeks = n/7;
        int days = n % 7;
        int ans = 0;
        ans += 28 * weeks + 7 * (weeks * (weeks-1))/2;
        int s = weeks+1;
        for(int i = 0; i < days; i++){
            ans += s+i;
        }
        return ans;
    }
}