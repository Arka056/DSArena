class Solution {
    public int candy(int[] ratings) {
        int n = ratings.length;
        int candy = n;
        int i = 1;

        while (i < n) {
            if (ratings[i] == ratings[i - 1]) {
                i++;
                continue;
            }

            // For increasing slope
            int peak = 0;
            while (i < n && ratings[i] > ratings[i - 1]) {
                peak++;
                candy += peak;
                i++;
            }

            // For decreasing slope
            int valley = 0;
            while (i < n && ratings[i] < ratings[i - 1]) {
                valley++;
                candy += valley;
                i++;
            }

            // Avoid double-counting peak/valley junction
            candy -= Math.min(peak, valley);
        }

        return candy;
    }
}
