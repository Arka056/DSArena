class Solution {
    public int maxFreqSum(String s) {
        int maxV = 0;
        int maxCon = 0;
        int [] freq = new int[26];
        for(char c: s.toCharArray())freq[c - 'a']++;
        String vowels = "aeiou";
        for(int i = 0; i < 26; i++){
            char c = (char) (i + 'a');
            if(vowels.indexOf(c)!=-1) maxV = Math.max(maxV, freq[i]);
            else maxCon = Math.max(maxCon, freq[i]);
        }
        return (maxV+maxCon);
        
    }
}