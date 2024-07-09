class Solution {
    public int solution(int number, int n, int m) {
        int answer = 0;
        
        for (int i = 0; i < n; i++) {
            if (number % n == 0 && number % m == 0) {
                answer = 1;
            } else {
                return answer;
            }
        }
        return answer;
    }
}