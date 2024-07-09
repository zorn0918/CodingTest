import java.util.Arrays;

class Solution {
    public int[] solution(int n) {
        int[] answer = new int[1000]; // 최대 1000개 수를 저장할 수 있는 배열
        int index = 0;
        
        answer[index++] = n;
        
        // 콜라츠 수열
        while (n != 1) {
            if (n % 2 == 0) {
                n /= 2;
            } else {
                n = 3 * n + 1;
            }
            answer[index++] = n;
        }
        
        return Arrays.copyOf(answer, index);
    }
}