class Solution {
    public int solution(int[][] board, int k) {
        int answer = 0;
        int rows = board.length;
        int cols = board[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (i + j <= k) {
                    answer += board[i][j];
                }
            }
        }

        return answer;
    }
}