class Solution {
    public int smallestNumber(int n) {
        // int bit = (int)(Math.floor(Math.log(n) / Math.log(2)))+1;
        // int mask = (1 << bit) - 1;
        // int ans = n | mask;
        // return ans;
        int len = Integer.SIZE - Integer.numberOfLeadingZeros(n);
        return (1 << len)-1;
    }
}