class Solution {
    public String removeOuterParentheses(String s) {
        // Stack<Character> st = new Stack<>();
        // String ans = "";
        // for(int i = 0; i < s.length(); i++){
        //     char ch = s.charAt(i);
        //     if(ch == '('){
        //     if(st.isEmpty()){
        //         st.push(ch);
        //     }
        //     ans += ch;
        //     }
        //     else if(ch == ')'){
        //             st.pop();
        //              if(!st.isEmpty()) {
        //             ans += ch; // not the outermost
        //         }
        //         }
        // }
        StringBuilder sb = new StringBuilder();
        int c = 0;
        for(char ch : s.toCharArray()){
            if(ch == '('){
                if(c > 0) sb.append(ch);
                c++;
            }
            else{
                c--;
                if(c > 0) sb.append(ch);
            }
        }
        return sb.toString();
    }
}