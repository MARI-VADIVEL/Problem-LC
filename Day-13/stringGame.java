class Solution {
    public char kthCharacter(int k) {
        int count = Integer.bitCount(k - 1);
        return (char)('a' + count);
    }
}