class Solution {
    public String solution(String[] my_strings, int[][] parts) {
        StringBuilder answer = new StringBuilder();
        
        for (int i = 0; i < my_strings.length; i++) {
            String str = my_strings[i];
            int[] part = parts[i];
            int start = part[0];
            int end = part[1];
            
            answer.append(str, start, end + 1);
        }
        
        return answer.toString();
    }
}