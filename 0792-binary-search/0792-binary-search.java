class Solution {
    public int search(int[] arr, int target) {
        int high = arr.length - 1;
        int low = 0;
        while(low <= high)
        {
            int mid = (low + high)/2;
            if(arr[mid] == target)
            {
                return mid;
            }
            else if(arr[mid] < target)
            {
                low = mid + 1;
            }
            else if(arr[mid] > target)
            {
                high = mid - 1;
            }
        }
        return -1;
    }
}