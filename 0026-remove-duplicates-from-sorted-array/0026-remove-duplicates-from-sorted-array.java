class Solution 
{
    public int removeDuplicates(int[] nums) 
    {
        // Set<Integer> arr = new HashSet<Integer>();
        // int uniqueInteger = 0;
        // for(int i = 0; i<nums.length;i++)
        // {
        //    if(arr.add(nums[i]))
        //    {
        //     nums[uniqueInteger++] = nums[i];
        //    }            
        // }     
        // return uniqueInteger;
        int i = 0;
        for (int j = 1; j < nums.length; j++)
        {
            if(nums[j] != nums[i])
            {
                nums[i+1] = nums[j];
                i++;
            }
        }
        return i+1;
    }
}