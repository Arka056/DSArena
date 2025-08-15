class Solution 
{
    public int[] twoSum(int[] a, int k) 
    {
    //    for(int i = 0; i < nums.length; i++)
    //    {
    //        for(int j = i + 1; j < nums.length; j++)
    //        {
    //            if(nums[i] + nums[j] == target)
    //            {
    //                int [] arr = {i, j};
    //                return arr;
    //            }
    //        }
    //    } 
    //    return null;
    
    // HashMap<Integer, Integer> map = new HashMap<>();
    //     for(int i = 0; i < a.length; i++){
    //         int rem = k - a[i];
    //         if(map.containsKey(rem)) return new int[]{map.get(rem), i};
    //         map.put(a[i], i);
    //     }
    //     return new int[]{};

HashMap<Integer, Integer> map = new HashMap<>();
for(int i = 0; i < a.length; i++){
    int rem = k - a[i];
    if(map.containsKey(rem)) return new int[]{map.get(rem), i};
    map.put(a[i], i);
}
return new int[]{};
}
}