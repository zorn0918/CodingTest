class Solution {
    public int solution(int a, int b) {
        String condition1 = Integer.toString(a) + b;
        String condition2 = Integer.toString(b) + a;

        int parse1 = Integer.parseInt(condition1);
        int parse2 = Integer.parseInt(condition2);

        return Math.max(parse1, parse2);
    }
}