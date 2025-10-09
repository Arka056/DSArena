class Solution {
    public boolean isLongPressedName(String s, String t) {
        // int []freq1 = new int[26];
        // int []freq2 = new int[26];
        // for(char c: name.toCharArray()){
        //     freq1[c-'a']++;
        // }
        // for(char c: typed.toCharArray()){
        //     freq2[c-'a']++;
        // }
        // for (int i = 0; i < 26; i++) {
        //     if (freq1[i] != freq2[i]) return false;
        // }
        // return true;
        // Set<Character> set  = new HashSet<>();
        // for(char c: typed.toCharArray())set.add(c);
        // return set.size() == name.length();
        int i = 0, j = 0, flag = 0;
        while(j < t.length()){
            if(i < s.length() && s.charAt(i) == t.charAt(j)){
                j++;
                i++;
            }
            else if(j > 0 && t.charAt(j) == t.charAt(j-1)){
                j++;
            }
            else return false;
        }
        return i == s.length();
    }
}