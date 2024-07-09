import java.util.Arrays;
import java.util.stream.Collectors;

class Solution {
    public int solution(int[] num_list) {
        int answer = 0;

        String odd = Arrays.stream(num_list)
                .filter(x -> x % 2 != 0)
                .mapToObj(Integer::toString)
                .collect(Collectors.joining());

        String even = Arrays.stream(num_list)
                .filter(x -> x % 2 == 0)
                .mapToObj(Integer::toString)
                .collect(Collectors.joining());

        answer += Integer.parseInt(odd) + Integer.parseInt(even);
        return answer;
    }
}