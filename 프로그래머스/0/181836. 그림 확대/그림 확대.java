class Solution {
    public String[] solution(String[] picture, int k) {
        int rows = picture.length;
        int cols = picture[0].length();
        
        String[] answer = new String[rows * k];
        
        for (int i = 0; i < rows; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < cols; j++) {
                for (int l = 0; l < k; l++) {
                    sb.append(picture[i].charAt(j));
                }
            }
            String enlargedRow = sb.toString();
            for (int m = 0; m < k; m++) {
                answer[i * k + m] = enlargedRow;
            }
        }
        
        return answer;
    }
}