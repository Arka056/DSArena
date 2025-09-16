class Solution {
    private int gcd(int a, int b){
        while(b != 0){
            int temp = a%b;
            a = b;
            b = temp;
        }
        return a;
    }
    public List<Integer> replaceNonCoprimes(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        for (int num : nums) {
            ans.add(num);
            while(ans.size() > 1){
                int a = ans.get(ans.size()-1);
                int b = ans.get(ans.size()-2);
                int k = gcd(a, b);
                if(k == 1)break;
                int lcm = (int)((long)a/k*b);
                ans.remove(ans.size()-1);
                ans.set(ans.size()-1, lcm);
            }
        }
        return ans;
    }
}