class Solution {
    public int countAsterisks(String s) {
        int count = 0;
        boolean insideBars = false;

        for (char ch : s.toCharArray()) {
            if (ch == '|') {
                insideBars = !insideBars;
            } else if (ch == '*' && !insideBars) {
                count++;
            }
        }

        return count;
    }
}