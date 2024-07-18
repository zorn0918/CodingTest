import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr) {
        int length = arr.length;
        int targetLength = 1;
        
        while (targetLength < length) {
            targetLength *= 2;
        }
        
        int[] result = new int[targetLength];
        
        System.arraycopy(arr, 0, result, 0, length);
        
        return result;
    }
}