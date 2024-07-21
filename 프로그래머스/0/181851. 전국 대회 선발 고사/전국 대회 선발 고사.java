import java.util.*;

class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        int n = rank.length;
        List<Integer> eligible = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            if (attendance[i]) {
                eligible.add(i);
            }
        }
        
        eligible.sort((a, b) -> Integer.compare(rank[a], rank[b]));
        
        int a = eligible.get(0);
        int b = eligible.get(1);
        int c = eligible.get(2);
        
        return 10000 * a + 100 * b + c;
    }
}