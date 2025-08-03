class Solution {
    public int singleNonDuplicate(int[] a) {
        // int res = 0;
        // for(int num: a){
        // res ^= num;
        // }
        // return res;
        int s = 0, e = a.length - 1;
        while (s < e) {
            int mid = (s + e) / 2;
            if (mid % 2 == 1) {
                mid--;
            }
            if (a[mid] != a[mid + 1]) {
                e = mid;
            } else {
                s = mid + 2;
            }
        }
        return a[s];
    }
}