class Solution {
    public int findMaxConsecutiveOnes(int[] arr) {
        int count = 0;
        int maxOnes = 0;
        for(int c : arr)
        {
            if(c == 1) count++;
            else count = 0;
            maxOnes = Math.max(maxOnes, count);
        }
        return maxOnes;
    }
}