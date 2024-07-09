class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        int a = slicer[0];
        int b = slicer[1];
        int c = slicer[2];

        return switch (n) {
            case 1 -> sliceArray(num_list, 0, b + 1);
            case 2 -> sliceArray(num_list, a, num_list.length);
            case 3 -> sliceArray(num_list, a, b + 1);
            case 4 -> sliceArrayWithInterval(num_list, a, b + 1, c);
            default -> new int[0];
        };
    }
    
    private int[] sliceArray(int[] arr, int start, int end) {

        int[] slicedArr = new int[end - start];
        if (end - start >= 0) System.arraycopy(arr, start, slicedArr, 0, end - start);
            
        return slicedArr;
    }
    
    private int[] sliceArrayWithInterval(int[] arr, int start, int end, int interval) {
        int length = (end - start + interval - 1) / interval;
        int[] slicedArr = new int[length];
        for (int i = 0; i < length; i++) {
            slicedArr[i] = arr[start + i * interval];
        }

        return slicedArr;
    }
}