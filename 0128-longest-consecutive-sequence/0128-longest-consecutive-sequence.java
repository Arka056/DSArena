class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0)return 0;
        int longest =1;
        HashSet<Integer> set = new HashSet<>();
        for(int n: nums)set.add(n);
        for(int n: set){
            if(!set.contains(n-1)){
                int c = 1;
                int x = n;
                while(set.contains(x+1)){
                    x +=1;
                    c +=1;
                }
                longest = Math.max(longest, c);
            }
        }
        return longest;
    }
}