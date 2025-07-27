class Sol {
    int isPossible(String s) {
        int [] count = new int[256];
        for(int i = 0;  i < s.length(); i++){
            count[s.charAt(i)]++;
        }
        int odd = 0;
        for(int i = 0; i < 256; i++){
            if((count[i] & 1) != 0)odd++;
        }
        return odd <= 1 ? 1: 0;
    }
}