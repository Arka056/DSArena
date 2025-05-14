class Solution {
    public int characterReplacement(String s, int k) {
        int[] occurArr = new int[26];
        int l = 0, maxOccurance = 0, ans = 0;

        for (int r = 0; r < s.length(); r++) {
            occurArr[s.charAt(r) - 'A']++;
            maxOccurance = Math.max(maxOccurance, occurArr[s.charAt(r) - 'A']);

            int windowLength = r - l + 1;

            if (windowLength - maxOccurance > k) {
                occurArr[s.charAt(l) - 'A']--;
                l++;
            }
            else {
                ans = Math.max(ans, windowLength);
            }
        }

        return ans;
    }
}
