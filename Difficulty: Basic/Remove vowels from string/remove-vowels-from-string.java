// User function Template for Java

class Solution {
    String removeVowels(String s) {
        // code here
      
      return s.replaceAll("(?i)[aeiou]", "");
    }
}