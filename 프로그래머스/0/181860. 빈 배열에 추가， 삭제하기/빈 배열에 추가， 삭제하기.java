import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int[] arr, boolean[] flag) {
        List<Integer> X = new ArrayList<>();
        
        for (int i = 0; i < arr.length; i++) {
            if (flag[i]) {
                for (int j = 0; j < arr[i] * 2; j++) {
                    X.add(arr[i]);
                }
            } else {
                int removeCount = arr[i];
                int size = X.size();
                for (int j = 0; j < removeCount && size > 0; j++) {
                    X.remove(size - 1);
                    size--;
                }
            }
        }
        
        return X.stream().mapToInt(i -> i).toArray();
    }
}