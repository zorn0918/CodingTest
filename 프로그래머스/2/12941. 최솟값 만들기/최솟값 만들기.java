import java.util.Arrays;
import java.util.Collections;

class Solution
{
    public int solution(int []A, int []B)
    {
        int answer = 0;
        int n = A.length;
        
        // A를 오름차순으로 정렬
        Arrays.sort(A);
        
        // B를 내림차순으로 정렬
        Integer[] B_Integer = new Integer[n];
        for (int i = 0; i < n; i++) {
            B_Integer[i] = B[i];
        }
        Arrays.sort(B_Integer, Collections.reverseOrder());
        
        for (int i = 0; i < n; i++) {
            answer += A[i] * B_Integer[i];
        }
        
        return answer;
    }
}