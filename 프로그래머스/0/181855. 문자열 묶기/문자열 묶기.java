import java.util.HashMap;
import java.util.Map;

class Solution {
    public int solution(String[] strArr) {
        Map<Integer, Integer> lengthCount = new HashMap<>();
        
        for (String str : strArr) {
            int length = str.length();
            lengthCount.put(length, lengthCount.getOrDefault(length, 0) + 1);
        }
        
        int maxCount = 0;
        for (int count : lengthCount.values()) {
            if (count > maxCount) {
                maxCount = count;
            }
        }
        
        return maxCount;
    }
}