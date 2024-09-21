class Solution {
    public int[] solution(String s) {
        int count = 0;  // 이진 변환 횟수
        int removedZeros = 0;  // 제거된 0의 개수
        
        while (!s.equals("1")) {
            int zeros = countZeros(s);
            removedZeros += zeros;
            s = s.replaceAll("0", "");
            
            s = Integer.toBinaryString(s.length());
            
            count++;
        }
        
        return new int[]{count, removedZeros};
    }
    
    // 문자열에서 0의 개수를 세는 helper 메소드
    private int countZeros(String s) {
        int count = 0;
        for (char c : s.toCharArray()) {
            if (c == '0') count++;
        }
        return count;
    }
}