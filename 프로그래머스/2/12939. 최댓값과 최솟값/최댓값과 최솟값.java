import java.util.Arrays;

class Solution {
    public String solution(String s) {
        String[] strNumbers = s.split(" ");
        int[] numbers = Arrays.stream(strNumbers).mapToInt(Integer::parseInt).toArray();

        int min = Arrays.stream(numbers).min().getAsInt();
        int max = Arrays.stream(numbers).max().getAsInt();

        return min + " " + max;
    }
}