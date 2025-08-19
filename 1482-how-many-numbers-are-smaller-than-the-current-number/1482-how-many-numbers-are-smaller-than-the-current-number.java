class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int [] ans = new int[nums.length];
        int k = 0;
        //Arrays.sort(nums);
        for(int i = 0; i < nums.length; i++){
            int c = 0;
            for(int j = 0; j < nums.length; j++){
                if(j != i && nums[j] < nums[i])c++;
            }
            ans[k++] = c;
        }
        return ans;
    }
}