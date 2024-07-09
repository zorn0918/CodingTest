class Solution {
    public int[] solution(String my_string) {
        int[] answer = new int[52]; // 길이 52의 정수 배열 생성
        
        for (int i = 0; i < my_string.length(); i++) {
            char ch = my_string.charAt(i);
            
            if (ch >= 'A' && ch <= 'Z') { // 대문자 'A'~'Z'까지의 등장 횟수
                answer[ch - 'A']++;
            } else { // 소문자 'a'~'z'까지의 등장 횟수
                answer[ch - 'a' + 26]++;
            }
        }
        
        return answer;
    }
}