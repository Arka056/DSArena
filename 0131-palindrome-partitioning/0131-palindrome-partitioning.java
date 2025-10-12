class Solution {
    private boolean isPalindrome(String s){
        if(s.length() == 1) return true;
        char[]ch = s.toCharArray();
        String t = s;
        int i = 0, j =  s.length()-1;
        while(i<=j){
            char temp = ch[i];
            ch[i] = ch[j];
            ch[j] = temp;
            i++;
            j--;
        }
        return t.equals(new String(ch));
    }
    private void getAllPal(String s, List<String> st, List<List<String>> list){
        if(s.length() == 0){
            list.add(new ArrayList<>(st));
            // return list;
        }
        for(int i = 0; i < s.length(); i++){
            String part = s.substring(0, i+1);
            if(isPalindrome(part)){
                st.add(part);
                getAllPal(s.substring(i+1), st, list);
                st.remove(st.size()-1);
            }
        }
    }
    public List<List<String>> partition(String s) {
        List<List<String>> list = new ArrayList<>();
        List<String> st = new ArrayList<>();
        getAllPal(s, st, list);
        return list;
    }
}