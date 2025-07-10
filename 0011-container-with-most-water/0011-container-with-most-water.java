class Solution {
    public int maxArea(int[] h) {
        int l = 0, r = h.length-1;
        int area = 0;
        while(l < r){
            area = Math.max(area, Math.min(h[l], h[r]) * (r-l));
            if(h[l] >= h[r]){
               r--;
            }
            else l++;
        }
        return area;
    }
}