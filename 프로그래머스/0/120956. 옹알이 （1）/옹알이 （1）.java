class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] speakable = {"aya", "ye", "woo", "ma"};
        
        for (String word : babbling) {
            String temp = word;
            boolean canSpeak = true;
            
            for (String speak : speakable) {
                if (temp.contains(speak + speak)) {
                    canSpeak = false;
                    break;
                }
                temp = temp.replace(speak, " ");
            }
            
            temp = temp.replace(" ", "");
            
            if (canSpeak && temp.length() == 0) {
                answer++;
            }
        }
        
        return answer;
    }
}