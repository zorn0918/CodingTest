class Solution {
    public String solution(String my_string, int s, int e) {
        char[] answer = my_string.toCharArray();
        reverseString(answer, s, e);
        
        return new String(answer);
    }
    
    private void reverseString(char[] chars, int start, int end) {
        while (start < end) {
            char temp = chars[start];
            chars[start++] = chars[end];
            chars[end--] = temp;
        }
    }
}