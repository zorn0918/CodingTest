class Solution {
    public int solution(String my_string) {
        String[] elements = my_string.split(" ");
        int result = Integer.parseInt(elements[0]);
        
        for (int i = 1; i < elements.length; i += 2) {
            String operator = elements[i];
            int number = Integer.parseInt(elements[i + 1]);
            
            if (operator.equals("+")) {
                result += number;
            } else if (operator.equals("-")) {
                result -= number;
            }
        }
        
        return result;
    }
}