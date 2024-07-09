class Solution {
    public int solution(int num, int n) {
        int answer = 0;
        
        for (int i = 1; i <= n; i++) {
            if (num % n == 0) {
                answer = 1;
            } else {
                return answer;
            }
        }
        return answer;
    }
}