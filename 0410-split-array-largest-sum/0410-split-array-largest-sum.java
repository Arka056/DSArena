class Solution {
    public int splitArray(int[] nums, int k) {
        int max = 0, sum = 0;
        for(int n : nums){
            max = Math.max(n, max);
            sum += n;
        }
        int l = max, h = sum;
        while(l < h){
            int mid = l + (h-l)/2;
            if(canSplit(mid, nums, k))h =mid;
            else l = mid+1;
        }
        return l;
    }
    public boolean canSplit(int maxAllowed, int []a, int k){
        int subArr = 1, currSum = 0;
        for(int n: a){
            if(currSum + n > maxAllowed){
            subArr++;
            currSum = n;
            if(subArr > k)return false;
            }
            else currSum += n;
        }
        return true;
    }
}