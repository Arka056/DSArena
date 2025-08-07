class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length() != goal.length())return false;
        // char []ch = s.toCharArray();
        // char []brr = new char[s.length()];
        // for(int i = 0; i < s.length(); i++){
        //     brr[(i+(ch.length-1))%ch.length] = ch[i];
        // }
        // for(int i = 0; i < ch.length; i++){
        //     ch[i] = brr[i];
        // }
        // String st = new String(ch);
        // return st.equals(goal);
        String rotated = s + s;
        return rotated.contains(goal);
    }
}