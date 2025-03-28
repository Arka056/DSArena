class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int l = 1;
        int r = Arrays.stream(piles).max().getAsInt();
        while(l < r){
            int mid = (l+r)/2;
            if(canFinish(piles, h, mid)) r = mid;
            else l = mid+1;
        }
        return l;
    }

    public boolean canFinish(int [] piles, int h, int k){
        int totalHours = 0;
        for(int pile : piles){
            totalHours += Math.ceil((double)pile/k);
        }
        return totalHours <= h;
    }
}