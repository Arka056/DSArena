class Solution {
    public int countKDifference(int[] a, int k) {
        int count = 0;
        // for(int i = 0; i < a.length; i++){
        //     for(int j = i+1; j< a.length; j++){
        //         if(Math.abs(a[j] - a[i]) == k)count++;
        //     }
        // }
        Map<Integer, Integer> map = new HashMap<>();
        for(int n: a){
            count += map.getOrDefault(n-k, 0);
            count += map.getOrDefault(n+k, 0);
            map.put(n, map.getOrDefault(n, 0)+1);
        }
        return count;
    }
}