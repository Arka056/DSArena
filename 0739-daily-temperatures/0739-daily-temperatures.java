class Solution {
    public int[] dailyTemperatures(int[] t) {
        int [] ans = new int[t.length];
        Stack<Integer> st = new Stack<>();
        for(int i = 0; i < t.length; i++){
            while(!st.isEmpty() && t[i] > t[st.peek()]){
                int idx = st.pop();
                ans[idx] = i - idx;
            }
            st.push(i);
        } 
        return ans;
    }
}