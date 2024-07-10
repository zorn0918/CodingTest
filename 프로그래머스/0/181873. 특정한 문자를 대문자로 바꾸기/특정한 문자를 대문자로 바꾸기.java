class Solution {
    public String solution(String my_string, String alp) {
        StringBuilder answer = new StringBuilder();
        
        for (char ch : my_string.toCharArray()) {
            if (String.valueOf(ch).equals(alp)) {
                answer.append(Character.toUpperCase(ch));
            } else {
                answer.append(ch);
            }
        }

        return answer.toString();
    }
}