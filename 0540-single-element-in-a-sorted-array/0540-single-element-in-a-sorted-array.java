class Solution {
    public int singleNonDuplicate(int[] a) {
    //     if(a.length == 1) return a[0];
    //     else if(a[0] != a[1]) return a[0];
    //     else if(a[a.length - 2] != a[a.length - 1]) return a[a.length - 1];
    //     int l = 1, h = a.length - 2;
    //     while(l <= h) {
    //         int mid = (h + l)/2;
    //         if((a[mid] != a[mid+1]) && (a[mid] != a[mid - 1])) return a[mid];
    //         else if((mid % 2 == 1 && a[mid - 1] == a[mid]) || (mid % 2 == 1 && a[mid + 1] == a[mid])) l = mid + 1;
    //         else h = mid - 1;
    //     }
    //  return -1;
    int res = 0;
    for(int num: a){
        res ^= num;
    }
    return res;
    }
}