import java.util.ArrayList;
import java.util.List;

class Solution {
    public String[] solution(String[] quiz) {
        List<String> resultList = new ArrayList<>();
        
        for (String q : quiz) {
            String[] parts = q.split(" ");
            int X = Integer.parseInt(parts[0]);
            String operator = parts[1];
            int Y = Integer.parseInt(parts[2]);
            int Z = Integer.parseInt(parts[4]);

            int calculatedResult = 0;
            if (operator.equals("+")) {
                calculatedResult = X + Y;
            } else if (operator.equals("-")) {
                calculatedResult = X - Y;
            }

            if (calculatedResult == Z) {
                resultList.add("O");
            } else {
                resultList.add("X");
            }
        }
        
        return resultList.toArray(new String[0]);
    }
}