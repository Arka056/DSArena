class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0 || strs == null) return "";
        int n = strs.length;
        String prefix = strs[0];
        for(int i = 1; i < n; i++){
          while(strs[i].indexOf(prefix) != 0){
            prefix = prefix.substring(0, prefix.length()-1);
            if(prefix.isEmpty()) return "";
          }
        }
        return prefix;
    }
}