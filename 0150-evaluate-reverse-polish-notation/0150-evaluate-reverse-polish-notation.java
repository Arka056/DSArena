class Solution {
    public int evalRPN(String[] t) {
        int n = t.length;
        Stack<Integer> st = new Stack<>();
        for(int i = 0;  i < n; i++){
            if(!t[i].equals("+") && !t[i].equals("-") && !t[i].equals("*") && !t[i].equals("/")) st.push(Integer.parseInt(t[i]));
            else{
                int ans = 0;
                if(!st.isEmpty()){
                int a = st.pop();
                int b = st.pop();
                switch(t[i]){
                    case "+":
                    ans = a + b;
                    break;
                    case "-":
                    ans = b-a;
                    break;
                    case "*":
                    ans = a * b;
                    break;
                    case "/":
                    ans = b/a;
                    break;
                }
                st.push(ans);}
            }
        } 
        return st.pop();
    }
}