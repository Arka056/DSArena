class Solution {
    public boolean search(int[] a, int k) {
        //Arrays.sort(a);
        int low = 0, high = a.length - 1;
        while(low <= high){
            int mid = (low + high) / 2;
            if(a[mid] == k) return true;
            else if(a[low] == a[mid] && a[mid] == a[high]){
                low++;
                high--;
            }
            else{
                if(a[low] <= a[mid]){
                    if(a[low] <= k && k <= a[mid]){
                        high = mid -1;
                    }
                    else low = mid + 1;
                }
                else{
                    if(a[mid] <= k && k <= a[high]){
                        low = mid + 1;
                    }
                    else  high = mid -1;
                }
            }
        }
        return false;
    }
}