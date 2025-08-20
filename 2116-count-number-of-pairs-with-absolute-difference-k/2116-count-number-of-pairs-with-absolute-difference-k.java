class Solution {
    public int countKDifference(int[] a, int k) {
        int count = 0;
        for(int i = 0; i < a.length; i++){
            for(int j = i+1; j< a.length; j++){
                if(Math.abs(a[j] - a[i]) == k)count++;
            }
        }
        return count;
    }
}