import java.util.*;

class Solution {
    public int maximumScore(int[] nums, int k) {
        int n = nums.length;
        Stack<Integer> stack = new Stack<>();
        int ans = 0;

        for(int i=0;i<=n;i++){
            int curr = i == n ? 0 : nums[i];

            while(!stack.isEmpty() && nums[stack.peek()] > curr){
                int min = nums[stack.pop()];
                int left = stack.isEmpty() ? 0 : stack.peek() + 1;
                int right = i - 1;

                if(left <= k && k <= right){
                    ans = Math.max(ans, min * (right - left + 1));
                }
            }

            stack.push(i);
        }

        return ans;
    }
}
