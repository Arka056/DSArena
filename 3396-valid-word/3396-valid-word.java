class Solution {
    public boolean isValid(String word) {
        if(word.length() < 3) return false;
        boolean hasVowel = false;
        boolean hasCons = false;
        for(char ch : word.toCharArray()){
          if(!Character.isLetterOrDigit(ch)) return false;
          if(Character.isLetter(ch)){
            char c = Character.toLowerCase(ch);
            if("aeiou".indexOf(c) != -1) hasVowel = true;
            else hasCons = true;
          }
        }
        return hasVowel && hasCons; 
    }
}