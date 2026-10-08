class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder result = new StringBuilder();
        int balance = 0;

        for (char c : s.toCharArray()) {
            if (c == '(') {
                balance++;
                if (balance > 1) {
                    result.append(c);
                }
            } else {
                balance--;
                if (balance > 0) {
                    result.append(c);
                }
            }
        }

        return result.toString();
    }
}