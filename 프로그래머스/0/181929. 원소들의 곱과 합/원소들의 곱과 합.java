class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int compare1 = 1;
        int compare2 = 0;

        for (int num : num_list) {
            compare1 *= num;
            compare2 += num;
        }
        compare2 = compare2 * compare2;
        
        if (compare1 < compare2) {
            answer += 1;
        }
        
        return answer;
    }
}