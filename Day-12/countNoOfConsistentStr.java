class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        HashSet<Character> set = new HashSet<>();
        for(int i=0;i<allowed.length();i++){
            set.add(allowed.charAt(i));
        }
        int count = 0;
        for(int i=0;i<words.length;i++){
            boolean valid = true;
            for(int j=0;j<words[i].length();j++){
                if(!set.contains(words[i].charAt(j))){
                    valid = false;
                    break;
                }
            }
            if(valid){
                count++;
            }
        }
        return count;
        
    }
}