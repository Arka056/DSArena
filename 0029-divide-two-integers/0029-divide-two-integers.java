class Solution {
    public int divide(int dividend, int divisor) {
        if(dividend == Integer.MIN_VALUE && divisor == -1)return Integer.MAX_VALUE;
        // double b = dividend / divisor;
        // b = Math.floor(b);
        return dividend / divisor;
    }
}