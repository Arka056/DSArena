class Solution {
    public int[] topKFrequent(int[] arr, int k) {
        if(k == arr.length) return arr;
        //int n = arr.length;
        Map<Integer, Integer> map = new HashMap<>();
        for(int brr : arr){
            map.put(brr, map.getOrDefault(brr, 0) + 1);
        }
        Queue<Integer> pq = new PriorityQueue<>((a, b)-> map.get(a)  - map.get(b));
        for(int n : map.keySet()){
            pq.add(n);
            if(pq.size() > k)pq.poll();
        }
        int [] res = new int[k];
        for (int i = k - 1; i >= 0; i--) {
            res[i] = pq.poll();
        }

        return res;
    }
}