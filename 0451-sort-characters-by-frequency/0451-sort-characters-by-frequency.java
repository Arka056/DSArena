class Solution {
    public String frequencySort(String s) {
        int []freq = new int[128];
        for(char c: s.toCharArray()){
            freq[c]++;
        }
        List<Character> ch = new ArrayList<>();
        for(char c: s.toCharArray()){
            ch.add(c);
        }
        Collections.sort(ch, (a,b)-> freq[a] != freq[b] ? freq[b]-freq[a]:(a-b));
        StringBuilder sb = new StringBuilder();
        for(char c: ch){
            sb.append(c);
        }
        return sb.toString();
        // String st = "";
        // for(char c: ch){
        //     st +=c;
        // }
        // return st;
    }
}