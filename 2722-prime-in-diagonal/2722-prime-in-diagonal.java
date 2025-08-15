class Solution {
    public boolean isPrime(int n){
        if(n <= 1) return false;
        if(n == 2) return true;
        if(n % 2 == 0)return false;
        for(int i = 3; i <= Math.sqrt(n); i++){
            if(n % i == 0) return false;
        }
        return true;
    }
    public int diagonalPrime(int[][] nums) {
        int t = 0;
        for(int i = 0; i < nums.length; i++){
            for(int j = 0; j < nums[i].length; j++){
                if(i == j || (i+j == nums.length-1)){
                if(isPrime(nums[i][j])){
                    t = Math.max(t, nums[i][j]);
                }
                }
            }
        }
        return t;
    }
}