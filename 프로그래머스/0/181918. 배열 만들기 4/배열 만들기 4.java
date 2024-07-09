import java.util.Arrays;
import java.util.Stack;

class Solution {
    public int[] solution(int[] arr) {
        Stack<Integer> stk = new Stack<>();
        
        for (int j : arr) {
            while (!stk.isEmpty() && stk.peek() >= j) {
                stk.pop();
            }
            stk.push(j);
        }
        
        int[] answer = new int[stk.size()];
        for (int i = stk.size() - 1; i >= 0; i--) {
            answer[i] = stk.pop();
        }
        
        return answer;
    }
}