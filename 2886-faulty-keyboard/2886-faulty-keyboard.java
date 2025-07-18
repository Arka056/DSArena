class Solution {
    public String finalString(String s) {
        StringBuilder st = new StringBuilder();
        for(char c: s.toCharArray()){
            if(c == 'i'){
                st.reverse();
            }
            else{
                st.append(c);
            }
        }
        return st.toString();
    }
}