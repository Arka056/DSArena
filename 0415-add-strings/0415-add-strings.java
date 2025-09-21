import java.math.BigInteger;
class Solution {
    public String addStrings(String num1, String num2) {
    //    BigInteger n1 = new BigInteger(num1);
    //    BigInteger n2 = new BigInteger(num2);
    //    BigInteger z = n1.add(n2);
    //    return z.toString();
    StringBuilder sb = new StringBuilder();
    int i = num1.length()-1;
    int j = num2.length()-1;
    int carry = 0;
    while(i >= 0 || j>= 0 || carry != 0){
        int x = i >= 0 ? num1.charAt(i)-'0':0;
        int y = j >= 0 ? num2.charAt(j)-'0':0;
        int sum = x+y+carry;
        sb.append(sum%10);
        carry = sum/10;
        i--;
        j--;
    }
    return sb.reverse().toString();
    }
}