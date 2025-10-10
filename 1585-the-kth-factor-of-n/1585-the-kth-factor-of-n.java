class Solution {
    public int kthFactor(int n, int k) {
        int ans;
        List<Integer> list = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            if(n % i == 0){
                list.add(i);
            }
        }
        if(list.size() < k) return -1;
        ans = list.get(k-1);
        return ans;
    }
}