class Solution {
    public String solution(String my_string, int[] indices) {
        StringBuilder answer = new StringBuilder();
        
        for (int i = 0; i < my_string.length(); i++) {
            boolean isRemoved = false;
            
            for (int index : indices) {
                if (i == index) {
                    isRemoved = true;
                    break;
                }
            }
            
            if (!isRemoved) {
                answer.append(my_string.charAt(i));
            }
        }
        
        return answer.toString();
    }
}