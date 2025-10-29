class Solution {
    public int hIndex(int[] c) {
        Arrays.sort(c);
        int h = 0;
        for(int i = c.length -1; i >= 0; i--){
            if(h < c.length){
                if(h < c[i])h++;
            }
        }
        return h;
    }
}