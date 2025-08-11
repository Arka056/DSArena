class Solution {
    public String longestPalindrome(String s) {
        if( s == null || s.length() <2)return s;
        int l = 0, r = 0;
        for(int i = 0; i < s.length(); i++){
            int l1 = findLength(s, i, i);
            int l2 = findLength(s, i, i+1);
            int len = Math.max(l1, l2);
            if(len > r-l){
                l = i - (len - 1)/2;
                r = i+len/2;
            }
        }
        return s.substring(l, r+1);
    }
    public int findLength(String s, int i, int j){
        while(i>= 0 && j < s.length() &&s.charAt(i)==s.charAt(j)){
            i--;
            j++;
        }
        return j-i-1;
    }
}