import java.util.Arrays;

class Solution {
    public int solution(String[] strs, String t) {
        int tLength = t.length();
        int[] dp = new int[tLength + 1];
        Arrays.fill(dp, tLength + 1);
        dp[0] = 0;

        for (int i = 1; i <= tLength; i++) {
            for (String str : strs) {
                if (t.startsWith(str, i - str.length())) {
                    dp[i] = Math.min(dp[i], dp[i - str.length()] + 1);
                }
            }
        }

        return dp[tLength] > tLength ? -1 : dp[tLength];
    }
}