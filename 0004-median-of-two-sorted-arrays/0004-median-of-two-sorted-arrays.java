class Solution {
    public double findMedianSortedArrays(int[] a1, int[] a2) {
        int []arr = new int[a1.length + a2.length];
         if (a1.length == 0) return a2.length % 2 == 0 ? (a2[a2.length / 2 - 1] + a2[a2.length / 2]) / 2.0 : a2[a2.length / 2];
        if (a2.length == 0) return a1.length % 2 == 0 ? (a1[a1.length / 2 - 1] + a1[a1.length / 2]) / 2.0 : a1[a1.length / 2];
        int i = 0, j = 0, k = 0;
        while(i < a1.length && j < a2.length){
            if(a1[i] <= a2[j]){
                arr[k++] = a1[i++];
            }
            else arr[k++] = a2[j++];
        }
        while(i < a1.length){
            arr[k++] = a1[i++];
        }
        while(j < a2.length){
            arr[k++] = a2[j++];
        }
        if(k % 2 == 0){
            int mid = k/2;
            double avg = (arr[mid-1] + arr[mid])/2.0;
            return avg;
        }
        else return (double)arr[k/2];
    }
}