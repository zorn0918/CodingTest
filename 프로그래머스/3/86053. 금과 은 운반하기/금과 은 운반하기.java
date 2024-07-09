class Solution {
    public long solution(int a, int b, int[] g, int[] s, int[] w, int[] t) {
        long left = 0;
        long right = (long) 1e15;
        long answer = right;

        while (left <= right) {
            long mid = (left + right) / 2;
            long gold = 0, silver = 0, total = 0;

            for (int i = 0; i < g.length; i++) {
                long roundTrip = mid / (t[i] * 2L); // 왕복 가능한 횟수
                if (mid % (t[i] * 2L) >= t[i]) {
                    roundTrip++; // 남은 시간으로 편도 가능한 경우
                }
                long maxTransport = roundTrip * w[i]; // 최대 운반 가능량

                gold += Math.min(g[i], maxTransport);
                silver += Math.min(s[i], maxTransport);
                total += Math.min(g[i] + s[i], maxTransport);
            }

            // 금, 은의 조건이 충족하는지 확인
            if (gold >= a && silver >= b && total >= (long) a + b) {
                answer = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return answer;
    }
}