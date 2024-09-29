import java.util.*;

class Solution {
    public int[] solution(int n) {
        ArrayList<Integer> div = new ArrayList<>();
        
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                div.add(i);
                if (i != n / i) {
                    div.add(n / i);
                }
            }
        }
        
        Collections.sort(div);
        
        return div.stream().mapToInt(i -> i).toArray();
    }
}