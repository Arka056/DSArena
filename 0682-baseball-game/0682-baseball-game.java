class Solution {
    public int calPoints(String[] op) {
        int sum = 0;
        List<Integer> list = new ArrayList<>();
        for(String s: op){
            if(s.matches("-?\\d+"))list.add(Integer.parseInt(s));
            else if(s.equals("C"))list.remove(list.size()-1);
            else if(s.equals("+")){
                int a = list.get(list.size()-1);
                int b = list.get(list.size()-2);
                list.add(a+b);
            }
            else if(s.equals("D")){
                int d = list.get(list.size()-1);
                list.add(2*d);
            }
            else continue;
        }
        for(Integer l: list){
            sum += l;
            // System.out.print(l + " ");
        }
        return sum;
    }
}