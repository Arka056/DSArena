class Solution {
    int missingNum(int arr[]) {
        // code here
        int n = arr.length +1;
        long sum =(long) (n+1)*n/2;
        for(int i = 0; i < arr.length; i++){
            sum -= arr[i];
        }
        return (int)sum;
    }
}