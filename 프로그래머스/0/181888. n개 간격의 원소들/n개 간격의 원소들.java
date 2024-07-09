class Solution {
    public int[] solution(int[] num_list, int n) {
        int resultSize = (num_list.length - 1) / n + 1;
        int[] result = new int[resultSize];

        for (int i = 0; i < resultSize; i++) {
            result[i] = num_list[i * n];
        }

        return result;
    }
}