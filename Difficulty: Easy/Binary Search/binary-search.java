class Solution {
    public int binarysearch(int[] arr, int k) {
        // Code Here
        int n= arr.length;
        int l = 0, r = n-1;int result = -1;
        while(l <= r){
            int mid = (l+r)/2;
            if(arr[mid] == k) {
                result = mid;
                r = mid - 1;
            }
            else if(arr[mid] > k) r = mid-1;
            else l = mid+1;
        }
        return result;
    }
}