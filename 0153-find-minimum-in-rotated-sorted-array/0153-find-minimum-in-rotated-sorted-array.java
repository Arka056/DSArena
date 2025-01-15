class Solution {
    public int findMin(int[] a) {
        int  l = 0, h = a.length - 1;
        while(l < h){
            int mid = l + (h - l)/2;
            if(a[mid] > a[h]){
                l = mid + 1;
            }
            else h = mid;
        }
        return a[l];
    }
}