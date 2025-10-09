class Solution {
    public void duplicateZeros(int[] arr) {
        // Queue<Integer> q = new LinkedList<>();
        // for(int i = 0; i < arr.length; i++){
        //     if(arr[i] == 0){
        //         q.add(0);
        //         q.add(0);
        //     }
        //     else{
        //         q.add(arr[i]);
        //     }
        //     int f = q.poll();
        //     arr[i] = f;
        // }

        int [] res = arr.clone();
        int j = 0;
        for(int i = 0; i < arr.length; i++){
            if(res[j]==0){
                arr[i] = 0;
                if(i+1 < arr.length){
                    arr[i+1] = 0;
                    i++;
                    j++;
                }
            }
            else{
                arr[i] = res[j];
                j++;
            }
        }
    }
}