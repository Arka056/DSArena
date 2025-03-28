class Solution {
    public int findKthPositive(int[] arr, int k) {
        int n = arr.length;
        HashSet<Integer> set = new HashSet<>();
        for(int x : arr){
            set.add(x);
        } 
        int count = 0;
        int num = 1;
        while(true){
            if(! set.contains(num)){
                count++;
                if(count == k) return num;
            }
            num++;
        }
    }
}