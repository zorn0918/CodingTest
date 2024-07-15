class Solution {
    public int solution(String myString, String pat) {
        StringBuilder swapped = new StringBuilder();
        
        for (char c : myString.toCharArray()) {
            if (c == 'A') {
                swapped.append('B');
            } else if (c == 'B') {
                swapped.append('A');
            }
        }
        
        return swapped.toString().contains(pat) ? 1 : 0;
    }
}