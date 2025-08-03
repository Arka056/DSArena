class Solution {
    public int removeElement(int[] a, int val) {
        int idx = 0;
        for(int i = 0; i < a.length; i++){
            if(a[i] != val){
                a[idx++] = a[i];
            }
        }
        return idx;
    }
}