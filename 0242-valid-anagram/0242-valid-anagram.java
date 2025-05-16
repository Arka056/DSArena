class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;
        // else {
        //     char[] c1 = s.toCharArray();
        //     char[] c2 = t.toCharArray();
        //     Arrays.sort(c1);
        //     Arrays.sort(c2);
        //     return Arrays.equals(c1, c2);
        // }
        else{
            int [] freq = new int[26];
            for(int c: s.toCharArray()){
                freq[c-'a']++;
            }
            for(int c: t.toCharArray()){
                freq[c-'a']--;
                if(freq[c-'a'] < 0) return false;
            }
            return true;
        }
    }
}