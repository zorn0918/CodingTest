class Solution {
    public int solution(int a, int b) {
        String condition1 = Integer.toString(a) + b;
        int condition2 = 2 * a * b;

        int parse1 = Integer.parseInt(condition1);

        if (parse1 == condition2) {
            return parse1;
        } else {
            return Math.max(parse1, condition2);
        }
    }
}