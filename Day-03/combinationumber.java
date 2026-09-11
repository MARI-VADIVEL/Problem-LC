class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        if (digits.length() == 0) {
            return result;
        }
        String[] phone = {
            "",     
            "",     
            "abc",  
            "def",  
            "ghi",  
            "jkl",  
            "mno",  
            "pqrs", 
            "tuv",  
            "wxyz" 
        };
        backtrack(0, digits, phone, new StringBuilder(), result);
        return result;
    }
    private void backtrack(
        int index,
        String digits,
        String[] phone,
        StringBuilder current,
        List<String> result
    ) {   
        if (index == digits.length()) {
            result.add(current.toString());
            return;
        }
        String letters = phone[digits.charAt(index) - '0'];
        for (char ch : letters.toCharArray()) {
            current.append(ch);
            backtrack(index + 1, digits, phone, current, result);
            current.deleteCharAt(current.length() - 1);
        }
    }
}