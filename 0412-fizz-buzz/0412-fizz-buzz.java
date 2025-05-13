class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> list = new ArrayList<>();
        int i = 1;
        while(i <= n){
            if(i % 3 == 0 && i % 5 == 0) list.add("FizzBuzz");
            else if(i % 5 == 0) list.add("Buzz");
            else if(i % 3 == 0 ) list.add("Fizz");
            else list.add(i+"");
            i++;
        }
        return list;
    }
}