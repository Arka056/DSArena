class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(arr);
        int min = Integer.MAX_VALUE;
        for(int i = 0; i< arr.length-1; i++){
            int ans = arr[i+1] - arr[i];
            min = Math.min(min, ans);
        }
        for(int i = 0; i < arr.length-1; i++){
            List<Integer> temp = new ArrayList<>();
            if((arr[i+1] - arr[i]) == min){
                temp.add(arr[i]);
                temp.add(arr[i+1]);
                list.add(temp);
            }
        }
        return list;
    }
}