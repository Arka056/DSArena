class Solution {
    public List<List<Integer>> threeSum(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> a = new ArrayList<>();
        for (int t = 0; t < arr.length; t++) {
            if (t > 0 && arr[t] == arr[t - 1]) {
                continue;
            }
            int i = t + 1;
            int j = arr.length - 1;
            while (i < j) {
                int sum = arr[t] + arr[i] + arr[j];
                if (sum < 0) {
                    i++;
                } else if (sum > 0) {
                    j--;
                } else {
                    a.add(Arrays.asList(arr[t], arr[i], arr[j]));
                
                while (i < j && arr[i] == arr[i + 1]) {
                    i++;
                }
                while (i < j && arr[j] == arr[j - 1]) {
                    j--;
                }
                i++;
                j--;
            }
            }
        }
        return a;
    }
}