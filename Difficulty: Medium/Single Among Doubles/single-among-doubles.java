// User function Template for Java

class Sol {
    public static int search(int n, int arr[]) {
        // your code here
        int ans = 0;
        for(int c : arr){
            ans ^= c;
        }
        return ans;
    }
}