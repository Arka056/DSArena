class Solution {
    public int maximum69Number (int num) {
        int i = 0, sixIdx = 0;
        int temp = num;
        while(temp != 0){
            int d = temp % 10;
            temp /= 10;
            if(i == 0){ 
                i = 1;
            }
            else i *= 10;
            if(d == 6){
                sixIdx = i;
            }  
        }
        return num+ 3*sixIdx;
    }
}