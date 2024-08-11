import java.util.*;

class Solution {
    public int solution(int n, int[][] data) {
        // x좌표를 기준으로 정렬
        Arrays.sort(data, (a, b) -> a[0] - b[0]);

        // 텐트 쌍 개수 계산
        int answer = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int x1 = data[i][0], y1 = data[i][1];
                int x2 = data[j][0], y2 = data[j][1];
                
                // 같은 x좌표 또는 y좌표를 가진 경우 건너뛰기
                if (x1 == x2 || y1 == y2) continue;
                
                boolean isValid = true;
                
                // 두 점 사이의 다른 점 확인
                for (int k = i + 1; k < j; k++) {
                    int x = data[k][0], y = data[k][1];
                    if ((x > x1 && x < x2) && (y > Math.min(y1, y2) && y < Math.max(y1, y2))) {
                        isValid = false;
                        break;
                    }
                }
                
                if (isValid) {
                    answer++;
                }
            }
        }

        return answer;
    }
}