import java.util.*;

class DistanceValue {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        Arrays.sort(arr2);

        int ans = 0;

        for(int x : arr1) {
            int left = 0;
            int right = arr2.length - 1;

            while(left <= right) {
                int mid = left + (right - left) / 2;

                if(arr2[mid] < x - d) {
                    left = mid + 1;
                }
                else {
                    right = mid - 1;
                }
            }

            if(left == arr2.length || arr2[left] > x + d) {
                ans++;
            }
        }

        return ans;
    }
}
