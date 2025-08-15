class Solution {
    public boolean isPowerOfFour(int n) {
    //  if(n==0) return false;
    //  if(n==1) return true;
    //  if(n%4!=0) return false;
    //  return isPowerOfFour(n/4);
   // if(n == 1) return true;
    if(n <=0)return false;
     return (n & (n - 1)) == 0 && (n & 0x55555555) != 0;
    }
}