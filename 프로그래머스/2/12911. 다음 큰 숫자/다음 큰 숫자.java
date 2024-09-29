class Solution {
    public int solution(int n) {
        int bitCount = Integer.bitCount(n);
        int nextBig = n + 1;
        
        while (true) {
            if (Integer.bitCount(nextBig) == bitCount) {
                return nextBig;
            }
            nextBig++;
        }
    }
}