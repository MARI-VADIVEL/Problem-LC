class GuessNumber {
    public int guessNumber(int n) {
        int left = 1;
        int right = n;

        while(left <= right) {
            int mid = left + (right - left) / 2;

            int x = guess(mid);

            if(x == 0) {
                return mid;
            }
            else if(x == 1) {
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }

        return -1;
    }

    int guess(int num) {
        return 0;
    }
}
