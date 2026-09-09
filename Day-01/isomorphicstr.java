class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        HashMap<Character,Integer> map1 = new HashMap<>();
        HashMap<Character,Integer> map2 = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char sch = s.charAt(i);
            char tch = t.charAt(i);
            if(!map1.containsKey(sch)){
                map1.put(sch,i);
            }
            if(!map2.containsKey(tch)){
                map2.put(tch,i);
            }
            if(!map1.get(sch).equals(map2.get(tch))){
                return false;

            }
        }
        return true;
        
    }
}