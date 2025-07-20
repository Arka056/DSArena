class Solution {
    public ArrayList<Integer> findDuplicates(int[] arr) {
        ArrayList<Integer> a = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i < arr.length; i++){
            if(set.contains(arr[i]))a.add(arr[i]);
            else set.add(arr[i]);
        }
        return a;
    }
}