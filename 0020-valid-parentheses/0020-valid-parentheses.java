class Solution {
    public boolean isValid(String s) {
        char[] ch = s.toCharArray();
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (ch[i] == '[' || ch[i] == '{' || ch[i] == '(') {
                st.push(ch[i]);
            }
            else {
                if (st.isEmpty()) return false;
                char top = st.peek();
                if ((ch[i] == ')' && top == '(') ||
                    (ch[i] == '}' && top == '{') ||
                    (ch[i] == ']' && top == '[')) {
                    st.pop();
                } else {
                    return false; // Mismatched or invalid character
                }
            }
        }
        return st.isEmpty();
    }
}
