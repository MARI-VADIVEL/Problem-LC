class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int left =0;
        int max =1 ;
        for(int right =1;right<nums.length;right++){
            if(nums[right]<=nums[right-1]){
                left = right;
            }
            max = Math.max(max, right-left+1);
        }
        return max;
        
    }
}