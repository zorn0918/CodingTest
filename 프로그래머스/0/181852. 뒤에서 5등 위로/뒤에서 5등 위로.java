import java.util.Arrays;

class Solution {
    public int[] solution(int[] num_list) {
        Arrays.sort(num_list);
        
        int resultSize = num_list.length - 5;
        
        int[] result = new int[resultSize];
        
        for (int i = 0; i < resultSize; i++) {
            result[i] = num_list[i + 5];
        }
        
        return result;
    }
}