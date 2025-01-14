class Solution {
    public int firstOccurrence(int []arr, int k){
        int low = 0, high = arr.length - 1;
        int first = -1;
        while(low <= high){
            int mid = (low + high) /2;
            if(arr[mid] == k){
                first = mid;
                high = mid -1;
            }
            else if(arr[mid] < k) low = mid + 1;
            else high = mid - 1;
        }
        return first;
    }
    public int lastOccurrence(int []arr, int k){
        int low = 0, high = arr.length - 1;
        int last = -1;
        while(low <= high){
            int mid = (low + high) /2;
            if(arr[mid] == k){
                last = mid;
                low = mid + 1;
            }
            else if(arr[mid] < k) low = mid + 1;
            else high = mid - 1;
        }
        return last;
    }
    public int[] searchRange(int[] arr, int k) {
        int first = firstOccurrence(arr, k);
        if(first == -1) return new int[]{-1, -1};
        int last = lastOccurrence(arr, k);
        return new int[] {first, last};
    }
}