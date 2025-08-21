class Solution {
    public int minSubArrayLen(int t, int[] arr) {
        int n = arr.length;
        int l = 0;
        int sum = 0, minLen = Integer.MAX_VALUE;
        for(int i = 0; i < n; i++){
            sum += arr[i];
            while(sum >= t){
                minLen = Math.min(minLen,  i-l + 1);
                sum -= arr[l];
                l++;
            }
        }
        return minLen == Integer.MAX_VALUE ? 0 : minLen;
    }
}