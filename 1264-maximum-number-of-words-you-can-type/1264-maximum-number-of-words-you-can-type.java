class Solution {
    public int canBeTypedWords(String text, String b) {
        String[] words = text.split(" ");
        int count = 0;
        for (String word : words) {
            boolean canType = true;
            for (char ch : b.toCharArray()) {
                if (word.indexOf(ch) != -1) {
                    canType = false;
                    break;
                }
            }
            if (canType) {
                count++;
            }
        }
        return count;
    }
}