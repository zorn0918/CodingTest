import java.util.Arrays;

class Solution {
    public int solution(int[] arr) {
        int count = 0;
        int[] prevArr = new int [arr.length];

        while (!Arrays.equals(arr, prevArr)) {
            System.arraycopy(arr, 0, prevArr, 0, arr.length);

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] >= 50 && arr[i] % 2 == 0) {
                    arr[i] /= 2;
                } else if (arr[i] < 50 && arr[i] % 2 != 0) {
                    arr[i] = arr[i] * 2 + 1;
                }
            }

            count++;
        }

        return count - 1;
    }
}