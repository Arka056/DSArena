class Solution {
    public int[] intersection(int[] a1, int[] a2) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        for(int n: a1){
            set1.add(n);
        }
        for(int n: a2){
            if(set1.contains(n))set2.add(n);
        }
        int []ans = new int[set2.size()];
        int k = 0;
        for(int s: set2){
            ans[k++] = s;
        }
        return ans;
    }
}