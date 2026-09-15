class Solution {
    public int findNonMinOrMax(int[] nums) {
        int min =100;
        int max =0;
        for(int num : nums){
            min = Math.min(num ,min);
            max =Math.max(num , max);
        }
        for(int num : nums){
            if(num!=max&&num!=min){
                return num;
            }
        }
        return -1;
        
    }
}