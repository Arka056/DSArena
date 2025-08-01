class Solution {
    public int searchInsert(int[] arr, int target) {
        int l = 0, r = arr.length - 1;
        while(l <= r){
            int mid = (l+r)/2;
            if(arr[mid] == target){
                return mid;
            }
            if(arr[mid] > target){
                r = mid-1;
            }
            else l = mid+1;
        }
        return l;
    }
}