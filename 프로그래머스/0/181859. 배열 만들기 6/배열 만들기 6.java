import java.util.Stack;

class Solution {
    public int[] solution(int[] arr) {
        Stack<Integer> stk = new Stack<>();
        
        for (int i = 0; i < arr.length; i++) {
            if (stk.isEmpty()) {
                stk.push(arr[i]);
            } else if (stk.peek() == arr[i]) {
                stk.pop();
            } else {
                stk.push(arr[i]);
            }
        }
        
        if (stk.isEmpty()) {
            return new int[]{-1};
        } else {
            int[] result = new int[stk.size()];
            for (int i = result.length - 1; i >= 0; i--) {
                result[i] = stk.pop();
            }
            return result;
        }
    }
}