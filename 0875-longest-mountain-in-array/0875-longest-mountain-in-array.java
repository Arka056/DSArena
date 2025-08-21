class Solution {
    public int longestMountain(int[] arr) {
        int count = 0;
        int n = arr.length;
        if(n<3) return 0;
        for(int i = 1; i < n-1; i++){
            if(arr[i-1] < arr[i] && arr[i] > arr[i+1]){
                int r = i+1;
                int l = i-1;

                while(l > 0 && arr[l-1] <arr[l]){
                    l--;
                } 
                while(r < n-1 && arr[r] > arr[r+1]){
                    r++;
                }
                count = Math.max(count, (r-l+1));
                // i = r;
            }
        }    
        return count;
    }
}