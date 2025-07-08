import java.util.*;

public class Solution {
    public static boolean hasTripletSum(int arr[], int t) {
        int n = arr.length;

        for (int i = 0; i < n - 2; i++) {
            HashSet<Integer> set = new HashSet<>();
            int currSum = t - arr[i];
            for (int j = i + 1; j < n; j++) {
                int needed = currSum - arr[j];
                if (set.contains(needed)){
                    return true;
                }
                set.add(arr[j]);
            }
        }

        return false;
    }
}
