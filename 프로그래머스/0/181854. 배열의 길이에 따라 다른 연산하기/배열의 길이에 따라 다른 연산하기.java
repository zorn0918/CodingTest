class Solution {
    public int[] solution(int[] arr, int n) {
        boolean isOddLength = arr.length % 2 != 0;
        
        for (int i = 0; i < arr.length; i++) {
            if (isOddLength && i % 2 == 0) {
                arr[i] += n;
            } else if (!isOddLength && i % 2 != 0) {
                arr[i] += n;
            }
        }
        
        return arr;
    }
}