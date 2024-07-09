class Solution {
    public int solution(int n) {
        int answer = 0;
        
        // n의 값이 홀수이면...
        if(n % 2 == 1) {
            for(int i = 1; i <= n; i+=2)
                answer += i;
        }
        // n의 값이 짝수이면...
        else {
            for(int i = 2; i <= n; i+=2)
                answer += i * i;
        }
        return answer;
    }
}