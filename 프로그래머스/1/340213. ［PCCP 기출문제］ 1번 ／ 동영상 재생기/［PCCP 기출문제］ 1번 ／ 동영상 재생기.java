class Solution {
    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        int videoLength = timeToSeconds(video_len);
        int currentPos = timeToSeconds(pos);
        int opStart = timeToSeconds(op_start);
        int opEnd = timeToSeconds(op_end);
        
        // 시작 위치가 오프닝 구간 내에 있는 경우 즉시 건너뛰기
        if (currentPos >= opStart && currentPos <= opEnd) {
            currentPos = opEnd;
        }
        
        for (String command : commands) {
            if (command.equals("next")) {
                currentPos = Math.min(videoLength, currentPos + 10);
            } else if (command.equals("prev")) {
                currentPos = Math.max(0, currentPos - 10);
            }
            
            // 명령어 실행 후 위치가 오프닝 구간 내에 있는 경우 즉시 건너뛰기
            if (currentPos >= opStart && currentPos <= opEnd) {
                currentPos = opEnd;
            }
        }
        
        return secondsToTime(currentPos);
    }
    
    private int timeToSeconds(String time) {
        String[] parts = time.split(":");
        return Integer.parseInt(parts[0]) * 60 + Integer.parseInt(parts[1]);
    }
    
    private String secondsToTime(int seconds) {
        int minutes = seconds / 60;
        int remainingSeconds = seconds % 60;
        return String.format("%02d:%02d", minutes, remainingSeconds);
    }
}