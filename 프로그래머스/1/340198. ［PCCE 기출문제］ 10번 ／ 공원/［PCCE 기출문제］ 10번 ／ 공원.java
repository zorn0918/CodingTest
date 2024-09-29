import java.util.*;

class Solution {
    public int solution(int[] mats, String[][] park) {
        Arrays.sort(mats);
        int rows = park.length;
        int cols = park[0].length;
        
        for (int i = mats.length - 1; i >= 0; i--) {
            int size = mats[i];
            if (canPlaceMat(park, rows, cols, size)) {
                return size;
            }
        }
        
        return -1;
    }
    
    private boolean canPlaceMat(String[][] park, int rows, int cols, int size) {
        for (int i = 0; i <= rows - size; i++) {
            for (int j = 0; j <= cols - size; j++) {
                if (isEmptySpace(park, i, j, size)) {
                    return true;
                }
            }
        }
        return false;
    }
    
    private boolean isEmptySpace(String[][] park, int startRow, int startCol, int size) {
        for (int i = startRow; i < startRow + size; i++) {
            for (int j = startCol; j < startCol + size; j++) {
                if (!park[i][j].equals("-1")) {
                    return false;
                }
            }
        }
        return true;
    }
}