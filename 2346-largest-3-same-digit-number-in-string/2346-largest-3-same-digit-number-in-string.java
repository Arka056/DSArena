class Solution {
    public String largestGoodInteger(String num) {
        // String s = "";
        // for(int i = 0; i < num.length()-2; i++){
        //     if(num.charAt(i) == num.charAt(i+1) && num.charAt(i) == num.charAt(i+2)){
        //         String ans = num.substring(i, i+3);
        //         if(s.equals("") || ans.compareTo(s) > 0) s = ans;
        //     }
        // }
        // return s;
        String [] ans = new String[]{"999", "888", "777", "666","555","444","333","222","111", "000"};
        for(String s: ans){
            if(num.contains(s)) return s;
        }
        return "";
    }
}