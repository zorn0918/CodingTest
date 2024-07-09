import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int[] solution(int[] arr, int[] query) {
        List<Integer> answer = new ArrayList<>();
        
        for (int num : arr) {
            answer.add(num);
        }
        
        for (int i = 0; i < query.length; i++) {
            int index = query[i];
            
            if (i % 2 == 0) {
                answer = answer.subList(0, index + 1);
            } else {
                answer = answer.subList(index, answer.size());
            }
        }
        
        return answer.stream().mapToInt(i -> i).toArray();
    }
}