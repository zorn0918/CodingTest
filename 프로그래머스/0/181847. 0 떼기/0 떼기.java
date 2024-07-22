class Solution {
    public String solution(String n_str) {
        int startIndex = 0;
        while (startIndex < n_str.length() && n_str.charAt(startIndex) == '0') {
            startIndex++;
        }
        
        return n_str.substring(startIndex);
    }
}