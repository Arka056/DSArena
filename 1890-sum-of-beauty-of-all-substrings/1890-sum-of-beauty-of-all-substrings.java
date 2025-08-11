class Solution {
    public int beautySum(String s) {
       int sum = 0;
       for(int i = 0; i < s.length(); i++){
        int []freq = new int[26];
        for(int j = i; j < s.length(); j++){
            int maxFreq = 0;
            int minFreq = Integer.MAX_VALUE;
            freq[s.charAt(j) - 'a']++;
            for(int f : freq){
                if(f > 0){
                    maxFreq = Math.max(maxFreq, f);
                    minFreq = Math.min(minFreq, f);
                }
            }
            sum += (maxFreq - minFreq);
        }
       }
       return sum;
    }
}