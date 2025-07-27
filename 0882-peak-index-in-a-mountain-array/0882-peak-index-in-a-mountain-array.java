class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int max = arr[0];
        int j = 0;
        for(int i = 0; i < arr.length; i++){
            if(max < arr[i] && i != j){
                max = arr[i];
                j = i;
            }
        }
        return j;
    }
}