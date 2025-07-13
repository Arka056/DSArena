
class Solution {
    public boolean findPair(int[] arr, int x) {
        // HashMap<Integer, Integer> map = new HashMap<>();
        // for(int i = 0;  i < arr.length; i++){
        //     int rem = arr[i] + x;
        //     if(map.containsKey(rem)) return true;
        //     map.put(arr[i], i);
        // }
        // return false;
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0;  i < arr.length; i++){
            if(set.contains(arr[i] + x) || set.contains(arr[i] - x)) return true;
            set.add(arr[i]);
        }
        return false;
    }
}
