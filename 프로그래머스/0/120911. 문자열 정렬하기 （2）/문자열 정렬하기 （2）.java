import java.util.Arrays;

class Solution {
    public String solution(String my_string) {
        String lowercaseString = my_string.toLowerCase();
        
        char[] charArray = lowercaseString.toCharArray();
        
        Arrays.sort(charArray);
        
        return new String(charArray);
    }
}