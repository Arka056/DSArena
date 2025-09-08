class Solution {
    public boolean isZero(int a){
        while(a > 0){
            if(a % 10 == 0)return false;
            a /= 10;
        }
        return true;
    }
    public int[] getNoZeroIntegers(int n) {
        int [] arr = new int [2];
        for(int i = 1; i<= n;i++){
            int a = i;
            int b = n-i;
            if( isZero(a) && isZero(b)){
                arr[0] = a;
                arr[1] = b;
                break;
            }
        }
        return arr;
    }
}