class Solution {
    public int[] productExceptSelf(int[] nums){
        int n = nums.length;
        int [] prodArr = new int[n];
        int mult = 1;
        int zeroPos = 0;
        for(int i = 0; i < n; i++){
            if (nums[i] == 0){
                zeroPos++;
                continue;
            }
            mult *= nums[i];
        }

        for(int i = 0; i < nums.length; i++){
            if(zeroPos > 1) prodArr[i] = 0;
            else if(zeroPos == 1){
                prodArr[i] = (nums[i] == 0) ? mult : 0;
            }
            else prodArr[i] = mult /nums[i];
        }
        return prodArr;
    }
}