class Solution {
    public String solution(String myString) {
        StringBuilder result = new StringBuilder();
        
        for (char ch : myString.toCharArray()) {
            if (ch == 'a' || ch == 'A') {
                result.append('A');
            } else if (Character.isUpperCase(ch)) {
                result.append(Character.toLowerCase(ch));
            } else {
                result.append(ch);
            }
        }
        
        return result.toString();
    }
}