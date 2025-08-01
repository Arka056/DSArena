class Solution {
    public String reverseVowels(String s) {
        int l = 0, r = s.length()-1;
        char [] ch = s.toCharArray();
        while(l <= r){
            if(!isVowel(ch[l]))l++;
            else if(!isVowel(ch[r]))r--;
            else{
                char temp = ch[l];
                ch[l] = ch[r];
                ch[r] = temp;
                l++;
                r--;
            }
        }
        return new String(ch);
    }
    public boolean isVowel(char c){
        return "aeiouAEIOU".indexOf(c) != -1;
    }
}