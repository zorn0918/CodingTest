import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(int l, int r) {
        List<Integer> list = new ArrayList<>();
        
        for (int i = l; i <= r; i++) {
            if (String.valueOf(i).replace("0", "").replace("5", "").isEmpty()) {
                list.add(i);
            }
        }
        
        int[] answer = !list.isEmpty() ? list.stream().mapToInt(i->i).sorted().toArray() : new int[]{-1};
        
        return answer;
    }
}