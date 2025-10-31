class Solution {
    public char repeatedCharacter(String s) {
        boolean [] freq = new boolean[26];
        for(char c: s.toCharArray()){
            if(freq[c-'a']) return c;
            freq[c-'a'] = true;
        }
        return ' ';
    }
}