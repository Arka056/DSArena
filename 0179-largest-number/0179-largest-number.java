class Solution {
    public String largestNumber(int[] nums) {
        String [] s = new String[nums.length];
        for(int i = 0; i < nums.length; i++){
            s[i] = String.valueOf(nums[i]);
        }
        Arrays.sort(s, (a,b) -> (b+a).compareTo(a+b));
        StringBuilder sb = new StringBuilder();
        for(String s1: s){
            sb.append(s1);
        }
        return sb.charAt(0) == '0' ? "0": sb.toString();
    }
}