class Solution {
    public int findPeakElement(int[] a) {
        if (a.length == 1)return 0;
        if (a[0] > a[1])return 0;
        if (a[a.length - 1] > a[a.length - 2]) {
            return a.length - 1;
        } else {
            int l = 1, h = a.length - 2;
            while (l <= h) {
                int mid = (l + h) / 2;
                if ((a[mid] > a[mid - 1]) && (a[mid] > a[mid + 1]))
                    return mid;
                if ((a[mid] < a[mid + 1]))
                    l = mid + 1;
                else
                    h = mid - 1;
            }
        }
        return -1;
    }
}