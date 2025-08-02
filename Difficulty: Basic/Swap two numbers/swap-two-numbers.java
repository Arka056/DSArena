class Solution {
    static List<Integer> get(int a, int b) {
        // code here
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        ArrayList<Integer> l = new ArrayList<>();
        l.add(a);
        l.add(b);
        return l;
    }
}