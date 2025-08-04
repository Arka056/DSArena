class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0 || strs == null) return "";
        // int n = strs.length;
        // String prefix = strs[0];
        // for(int i = 1; i < n; i++){
        //   while(strs[i].indexOf(prefix) != 0){
        //     prefix = prefix.substring(0, prefix.length()-1);
        //     if(prefix.isEmpty()) return "";
        //   }
        // }
        // return prefix;
        Arrays.sort(strs);
        String p = strs[0];
        String q = strs[strs.length - 1];
        int i = 0;
        while(i < p.length() && i < q.length() && p.charAt(i) == q.charAt(i)) i++;
        return p.substring(0, i);
    }
}