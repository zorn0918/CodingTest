class Solution {
    public String solution(String my_string, int n) {
        int strLength = my_string.length();
        
        return my_string.substring(strLength - n);
    }
}