class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans = new ArrayList<>();
        bt(n,k,1,new ArrayList<>(),ans);
        return ans; 
    }
    public void bt(int n,int k,int index,List<Integer> list,List<List<Integer>> ans){
        if(list.size()==k){
            ans.add(new ArrayList<>(list));
            return;
        }
        for(int i=index;i<=n;i++){
            list.add(i);
            bt(n,k,i+1,list,ans);
            list.remove(list.size()-1);
        }
    }
}