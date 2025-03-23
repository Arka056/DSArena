class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs.length == 0) return new ArrayList();
        Map<String, List> resMap = new HashMap<>();
        int [] countChars = new int[26];
        for(String s : strs){
            Arrays.fill(countChars, 0);
            for(char ch : s.toCharArray()){
                countChars[ch - 'a']++;
            }
            StringBuilder sb = new StringBuilder("");

            for(int i = 0; i < 26; i++){
                sb.append("#");
                sb.append(countChars[i]);
            }
            String key = sb.toString();
            if(!resMap.containsKey(key)) resMap.put(key, new ArrayList());
            resMap.get(key).add(s);
            }
            return new ArrayList(resMap.values());
        }
}