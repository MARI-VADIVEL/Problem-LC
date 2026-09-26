class MaximumFruits {
    public int maxTotalFruits(int[][] fruits, int startPos, int k) {
        int left = 0;
        int sum = 0;
        int ans = 0;

        for(int right=0;right<fruits.length;right++) {
            sum += fruits[right][1];

            while(left <= right && steps(fruits[left][0], fruits[right][0], startPos) > k) {
                sum -= fruits[left][1];
                left++;
            }

            ans = Math.max(ans, sum);
        }

        return ans;
    }

    public int steps(int left, int right, int startPos) {
        if(right <= startPos) {
            return startPos - left;
        }

        if(left >= startPos) {
            return right - startPos;
        }

        int leftFirst = 2 * (startPos - left) + (right - startPos);
        int rightFirst = (startPos - left) + 2 * (right - startPos);

        return Math.min(leftFirst, rightFirst);
    }
}
