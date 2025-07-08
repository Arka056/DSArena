class Solution {
    boolean isPalindrome(String s) {
        int n = s.length();
        if(s.charAt(0) != s.charAt(n-1)) return false;
        int l = 1, r = n - 2, flag = 0;
        while(l < r){
            if(s.charAt(l) == s.charAt(r)){
                l++;
                r--;
            }
            else{
                flag = 1;
                break;}
        }
        return flag == 0;
    }
}