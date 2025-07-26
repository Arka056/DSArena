class Solution {
    public int findDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int s = nums[0];
        for(int x : nums){
            if(set.contains(x)){
                s = x;
            }
            else{
                set.add(x);
            }
        }
        return s;
    }
}