class Solution {
public:
    vector<int> canSeePersonsCount(vector<int>& h) {
        int n=h.size();
        vector<int>ans(n,0);
        stack<int>st;
        ans[n-1]=0;
        st.push(h[n-1]);
        for(int i=n-2;i>=0;i--){
            int c=0;
            while(st.size()>0 && st.top()<h[i]){
                st.pop();
                c++;
            }
            if(st.size()>0) c++;
            ans[i]=c;
            st.push(h[i]);
        }
        return ans;
    }
};