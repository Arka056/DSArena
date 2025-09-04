class Solution {
    public int findClosest(int x, int y, int z) {
        int t1 = Math.abs(z-x);
        int t2 = Math.abs(z-y);
        if(t1 == t2) return 0;
        return t1 > t2 ? 2 : 1;
    }
}