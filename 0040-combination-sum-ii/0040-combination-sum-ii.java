

class Solution {
    public void combSum2(int[] arr, int start, List<Integer> comb, List<List<Integer>> ans, int t) {
        if (t == 0) {
            ans.add(new ArrayList<>(comb));
            return;
        }
        for (int i = start; i < arr.length; i++) {
            // Skip duplicates at the same recursion depth
            if (i > start && arr[i] == arr[i - 1]) continue;

            // Stop early if current number is too large
            if (arr[i] > t) break;

            comb.add(arr[i]);
            combSum2(arr, i + 1, comb, ans, t - arr[i]); // move forward
            comb.remove(comb.size() - 1);
        }
    }

    public List<List<Integer>> combinationSum2(int[] arr, int t) {
        Arrays.sort(arr);
        List<List<Integer>> ans = new ArrayList<>();
        combSum2(arr, 0, new ArrayList<>(), ans, t);
        return ans;
    }
}
