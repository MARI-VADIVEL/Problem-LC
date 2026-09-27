class Solution {
    public boolean isPossible(int[] target) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());

        long sum=0;

        for(int num:target){
            pq.add(num);
            sum+=num;
        }

        while(pq.peek()!=1){
            long max=pq.poll();
            long rest=sum-max;

            if(rest==1){
                return true;
            }

            if(rest<=0 || max<=rest){
                return false;
            }

            long prev=max%rest;

            if(prev==0){
                return false;
            }

            pq.add((int)prev);
            sum=rest+prev;
        }

        return true;
    }
}