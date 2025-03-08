class Solution {
    public boolean containsDuplicate(int[] arr) {

        // for (int i = 0; i < arr.length; i++) {
        //     for (int j = i+1; j < arr.length ; j++) {
        //         if (arr[i] == arr[j]) {
        //             return true;
        //         }
        //     }
        // }
        HashSet<Integer> a = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            a.add(arr[i]);
        }
        if (a.size() < arr.length) return true;
        else return false;
    }
}