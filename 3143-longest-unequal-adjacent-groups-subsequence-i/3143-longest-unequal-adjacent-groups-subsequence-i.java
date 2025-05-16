class Solution {
    public List<String> getLongestSubsequence(String[] words, int[] groups) {
        List<String> ans = new ArrayList<>();
        int last = -1;
        for(int i = 0; i < words.length; i++){
            if(groups[i] != last){
                ans.add(words[i]);
                last = groups[i];
            }
        } 
        return ans;    }
}