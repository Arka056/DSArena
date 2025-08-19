class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> arr = new ArrayList<>();
        int n = nums.length;
        int sum = n*(n+1)/2;
        Set<Integer> set = new HashSet<>();
        for(int x: nums){
            set.add(x);
        }
        int i = 1;
        while(i <= n){
            if(!set.contains(i))arr.add(i);
            i++;
        }
        return arr;
    }
}