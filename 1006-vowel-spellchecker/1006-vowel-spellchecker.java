class Solution {
    public boolean isVowel(char c){
        return "aeiou".indexOf(c) != -1;
    }
    public String[] spellchecker(String[] wordlist, String[] queries) {
        Set<String> exact = new HashSet<>();
        Map<String, String> caseMap = new HashMap<>();
        Map<String, String> vowelMap = new HashMap<>();
        for(String w: wordlist){
            exact.add(w);
            String lower = w.toLowerCase();
            caseMap.putIfAbsent(lower, w);
            String masked = maskVowels(lower);
            vowelMap.putIfAbsent(masked, w);
        }
        String[] ans = new String[queries.length];
        for (int i = 0; i < queries.length; i++) {
            String q = queries[i];
            
            if (exact.contains(q)) {
                ans[i] = q;
            } else {
                String lower = q.toLowerCase();
                if (caseMap.containsKey(lower)) {
                    ans[i] = caseMap.get(lower);
                } else {
                    String maskedQ = maskVowels(lower);
                    if (vowelMap.containsKey(maskedQ)) {
                        ans[i] = vowelMap.get(maskedQ);
                    } else {
                        ans[i] = "";
                    }
                }
            }
        }
        return ans;
    }
    
    private String maskVowels(String s) {
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (isVowel(c)) {
                sb.append('*');
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }
    
}