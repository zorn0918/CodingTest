class Solution {
    public int solution(int order) {
        int cnt = 0;
        
        while (order > 0) {
            int num = order % 10;
            if (num == 3 || num == 6 || num == 9) {
                cnt++;
            }
            order /= 10;
        }
        
        return cnt;
    }
}