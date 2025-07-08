class Solution {
    public void sortColors(int[] nums) {
        // 1. Bruteforce 
        // Arrays.sort(nums);

        // 2. Optimized
        int c0 = 0, c1 = 0, c2 = 0;
        for(int i : nums){
            if(i == 0) c0+=1;
            if(i == 1) c1+=1;
            if(i == 2) c2+=1;
        }
        for(int i = 0; i < c0; i++){
            nums[i] = 0;
        }
        for(int i = c0; i < c1+c0; i++){
            nums[i] = 1;
        }
        for(int i = (c1+c0); i < nums.length; i++){
            nums[i] = 2;
        }
    }
}