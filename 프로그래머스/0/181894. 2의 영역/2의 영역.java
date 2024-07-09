import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int[] solution(int[] arr) {
        List<Integer> isTwoIndices = new ArrayList<Integer>();
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 2) {
                isTwoIndices.add(i);
            }
        }
        
        if (isTwoIndices.isEmpty()) {
            return new int[]{-1};
        }
        
        int start = isTwoIndices.get(0);
        int end = isTwoIndices.get(isTwoIndices.size() - 1);
        
        int[] answer = new int[end - start + 1];
        
        if (end + 1 - start >= 0) System.arraycopy(arr, start, answer, start - start, end + 1 - start);
        
        return answer;
    }
}