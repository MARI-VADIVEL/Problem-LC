class Solution {
    public static int counting(int matrix[][], int target) {
        int count = 0;
        int n = matrix.length;

        for(int i = 0; i < n; i++){

            if(matrix[i][n - 1] <= target){
                count += n;
                continue;
            }

            int low = 0;
            int high = n - 1;

            while(low <= high){
                int mid = low + (high - low) / 2;

                if(matrix[i][mid] <= target){
                    low = mid + 1;
                }else{
                    high = mid - 1;
                }
            }

            count += low;
        }

        return count;
    }

    public int kthSmallest(int[][] matrix, int k) {
        int n = matrix.length;

        int low = matrix[0][0];
        int high = matrix[n - 1][n - 1];

        while(low < high){
            int mid = low + (high - low) / 2;

            int count = counting(matrix, mid);

            if(count >= k){
                high = mid;
            }else{
                low = mid + 1;
            }
        }

        return low;
    }
}
