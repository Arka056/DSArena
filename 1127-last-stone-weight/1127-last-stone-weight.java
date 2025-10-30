class Solution {
    public int lastStoneWeight(int[] st) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for(int i: st){
            maxHeap.add(i);
        }
        int n = st.length;
        int x, y;
        while(n > 1){
            y = maxHeap.poll();
            x = maxHeap.poll();
            n -= 2;
            if(y-x> 0){
                maxHeap.add(y-x);
                n++;
            }
        }
        return maxHeap.isEmpty() ? 0 : maxHeap.poll();
    }
}

/*
1 1 2 4 7 8
i = 5-> sum 1
s
*/