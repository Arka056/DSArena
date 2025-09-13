class Solution {
    public int[] intersect(int[] a1, int[] a2) {
        int i = 0, j = 0,t =0;
        int n1 = a1.length;
        int n2 = a2.length;
        Arrays.sort(a1);
        Arrays.sort(a2);
        int [] arr = new int[Math.min(n1, n2)];
        while(i < n1 && j < n2){
            if(a1[i] == a2[j]){
                arr[t++] = a1[i];
                i++;
                j++;
            }
            else if(a1[i] < a2[j])i++;
            else j++;
        }
        return Arrays.copyOfRange(arr, 0, t);
    }
}