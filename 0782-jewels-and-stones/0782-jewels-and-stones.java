class Solution {
    public int numJewelsInStones(String jew, String s) {
        int count = 0;
        Set<Character> set = new HashSet<>();
        for(char s1: jew.toCharArray()){
            set.add(s1);
        }
        for(char t: s.toCharArray()){
            if(set.contains(t))count++;
        }
        return count;
    }
}