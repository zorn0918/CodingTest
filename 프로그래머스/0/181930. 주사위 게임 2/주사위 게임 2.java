class Solution {
    public int solution(int a, int b, int c) {
        int answer = 0;
        int square = (int) (Math.pow(a, 2) + Math.pow(b, 2) + Math.pow(c, 2));
        int cube = (int) (Math.pow(a, 3) + Math.pow(b, 3) + Math.pow(c, 3));

        if (a == b && b == c) {
            answer += (a + b + c) * (square * cube);
        } else if (a == b || a == c || b == c) {
            answer += (a + b + c) * square;
        } else {
            answer += a + b + c;
        }
        return answer;
    }
}