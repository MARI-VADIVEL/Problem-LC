class Solution {
    public String arrangeWords(String text) {
        text=text.toLowerCase();

        String[] words=text.split(" ");

        Arrays.sort(words,(a,b)->a.length()-b.length());

        StringBuilder str=new StringBuilder();

        for(int i=0;i<words.length;i++){
            str.append(words[i]);

            if(i<words.length-1){
                str.append(" ");
            }
        }

        str.setCharAt(0,Character.toUpperCase(str.charAt(0)));

        return str.toString();
    }
}