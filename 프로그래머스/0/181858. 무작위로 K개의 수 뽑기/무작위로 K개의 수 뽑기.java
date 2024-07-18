import java.util.HashSet;
import java.util.Set;

class Solution {
    public int[] solution(int[] arr, int k) {
        int[] result = new int[k];
        Set<Integer> uniqueNumbers = new HashSet<>();
        int index = 0;
        
        for (int num : arr) {
            if (!uniqueNumbers.contains(num)) {
                uniqueNumbers.add(num);
                result[index++] = num;
                
                if (index == k) {
                    break;
                }
            }
        }
        
        while (index < k) {
            result[index++] = -1;
        }
        
        return result;
    }
}