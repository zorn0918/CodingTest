import java.util.*;

class Solution {
    public int solution(int[] A, int[] B) {
        // A팀의 수를 정렬 (오름차순)
        Arrays.sort(A);
        
        // B팀의 수를 정렬 (내림차순)
        Integer[] sortedB = Arrays.stream(B).boxed().toArray(Integer[]::new);
        Arrays.sort(sortedB, Collections.reverseOrder());
        
        int n = A.length;
        int bIndex = 0; // B팀의 현재 인덱스
        int bScore = 0; // B팀의 점수

        // A팀의 가장 큰 수부터 비교 시작
        for (int i = n - 1; i >= 0; i--) {
            if (sortedB[bIndex] > A[i]) {
                bScore++;
                bIndex++;
            }
        }

        return bScore;
    }
}