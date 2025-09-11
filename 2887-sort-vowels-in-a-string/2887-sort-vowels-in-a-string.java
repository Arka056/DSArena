class Solution {
    public boolean isVowel(char c){
        return "aeiouAEIOU".indexOf(c) != -1;
    }
    public String sortVowels(String s) {
        int n = s.length();
        List<Character> list = new ArrayList<>();
        for(int i = 0; i < n; i++){
            if(isVowel(s.charAt(i))){
                list.add(s.charAt(i));
            }
        }
        Collections.sort(list);
        StringBuilder sb = new StringBuilder(s);
        int t = 0;
        for(int i = 0; i < n; i++){
            if(isVowel(s.charAt(i))){
                sb.setCharAt(i, list.get(t++));
            }
        }
        return sb.toString();
    }
}