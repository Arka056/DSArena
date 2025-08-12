class Solution {
    public int[] rearrangeArray(int[] a) {
        int [] b = new int[a.length];
        int pos = 0, neg = 1;
        for(int n : a){
            if(n > 0){
                b[pos] = n;
                pos += 2;
            } 
            else{
                b[neg] = n;
                neg += 2;
            }
        }
        return b;
    }
}