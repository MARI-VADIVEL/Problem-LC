class Solution {
    public String addStrings(String num1, String num2) {
        int n1 = num1.length()-1;
        int n2 = num2.length()-1;
        int carry = 0;
        StringBuilder result = new StringBuilder();
        while(n1>=0||n2>=0||carry>0){
            int digit1 = (n1>=0) ? num1.charAt(n1)-'0' : 0;
            int digit2 = (n2>=0) ? num2.charAt(n2)-'0' : 0;
            int sum = digit1+digit2+carry;
            int digit = sum%10;
            result.append(digit);
             carry = sum/10;
            n1--;
            n2--;
        }

        return result.reverse().toString();
        
    }
}