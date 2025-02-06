class Solution {
    public int lengthOfLongestSubstring(String s) {
       HashMap < Character, Integer > hMap = new HashMap < Character, Integer > ();
        int left = 0, right = 0;
        int n = s.length();
        int maxLen = 0;
        while (right < n) {
            if (hMap.containsKey(s.charAt(right))) left = Math.max(hMap.get(s.charAt(right)) + 1, left);

            hMap.put(s.charAt(right), right);

            maxLen = Math.max(maxLen, right - left + 1);
            right++;
        }
        return maxLen;

    }
}