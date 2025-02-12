class Solution 
{
    public long mod = 1000000007;
    public long pow(long x, long y) {
        if (y == 0) return 1;
        long ans = pow(x, y / 2);
        ans = (ans * ans) % mod; // Ensure modulus is applied

        if (y % 2 != 0) {
            ans = (ans * x) % mod; // Apply modulus after multiplication
        }

        return ans;
    }
    public int countGoodNumbers(long n) 
    {
        long odd = n/2;
        long even = n/2 + n%2;
        return (int) (( pow(5, even)* pow(4, odd))%mod);
    }
}