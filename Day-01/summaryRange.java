class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> list = new ArrayList<>();
        int n = nums.length;
        int start =0;
        for(int i=0;i<n;i++){
            if(i==n-1||nums[i]+1!=nums[i+1]){
                if(start==i){
                    list.add(String.valueOf(nums[i]));
                }else{
                    list.add(nums[start]+"->"+nums[i]);
                }
                start = i+1;
            }
          
        }
          return list;
        
    }
}