class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()) return false;
        Map<Character, Integer> mp1 = new HashMap<>();
        Map<Character, Integer> mp2 = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            mp1.putIfAbsent(s.charAt(i), i);
            mp2.putIfAbsent(t.charAt(i), i);
            if(! mp1.get(s.charAt(i)).equals(mp2.get(t.charAt(i)))) return false;
        }

        return true;
    }
}