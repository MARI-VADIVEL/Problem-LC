class Solution {
    public int minMaxDifference(int num) {
        String s = String.valueOf(num);

        char maxDigit = ' ';
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) != '9') {
                maxDigit = s.charAt(i);
                break;
            }
        }

        String max;
        if(maxDigit == ' ') {
            max = s;
        } else {
            max = s.replace(maxDigit, '9');
        }

        char minDigit = s.charAt(0);
        String min = s.replace(minDigit, '0');

        return Integer.parseInt(max) - Integer.parseInt(min);
    }
}
