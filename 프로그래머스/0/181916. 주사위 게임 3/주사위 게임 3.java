class Solution {
    public int solution(int a, int b, int c, int d) {
        // 네 주사위 숫자가 모두 같은 경우
        if (a == b && b == c && c == d) {
            return 1111 * a;
        }
        
        // 세 주사위 숫자가 같고 나머지 주사위의 숫자가 다른 경우
        if (a == b && b == c || a == b && b == d || a == c && c == d || b == c && c == d) {
            int same = a == b ? a : c;
            int diff = a != same ? a : b != same ? b : c != same ? c : d;
            return (10 * same + diff) * (10 * same + diff);
        }
        
        // 두 주사위 숫자가 같은 경우
        if (a == b && c == d || a == c && b == d || a == d && b == c) {
            int same = b != a ? b : c;
            return (a + same) * Math.abs(a - same);
        }
        
        // 두 주사위 숫자가 같고 나머지 두 주사위 숫자가 다른 경우
        if (a == b || a == c || a == d || b == c || b == d || c == d) {
            int same = a == b ? a : a == c ? a : a == d ? a : b == c ? b : b == d ? b : c;
            int diff1 = a != same ? a : b != same ? b : c;
            int diff2 = b != same && b != diff1 ? b : c != same && c != diff1 ? c : d;
            return diff1 * diff2;
        }
        
        // 네 주사위 숫자가 모두 다른 경우
        return Math.min(Math.min(a, b), Math.min(c, d));
    }
}