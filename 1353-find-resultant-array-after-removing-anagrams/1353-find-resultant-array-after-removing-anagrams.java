class Solution {
    private boolean isAnagram(String s, String t){
        if(s.length() != t.length()) return false;
        else{
            int [] freq = new int[26];
            for(int c: s.toCharArray()){
                freq[c - 'a']++;
            }
            for(int c: t.toCharArray()){
                freq[c-'a']--;
                if(freq[c-'a'] < 0) return false;
            }
            return true;
        }
    }
    public List<String> removeAnagrams(String[] words) {
        int n = words.length;
        List<String> ans = new ArrayList<>();
        ans.add(words[0]);
        for(int w = 1; w< words.length; w++){
            if(!isAnagram(words[w], words[w-1])){
                ans.add(words[w]);
                // w+=2;
            }
            // else ans.add(words[w]);
        }
        return ans;
    }
}