import java.util.ArrayList;
import java.util.List;

class Solution {
    public String[] solution(String[] str_list) {
        List<String> result = new ArrayList<>();

        for (int i = 0; i < str_list.length; i++) {
            if (str_list[i].equals("l")) {
                // "l"이 먼저 나온 경우에는 왼쪽의 문자열들을 반환함
                return result.toArray(new String[0]);
            } else if (str_list[i].equals("r")) {
                // "r"이 먼저 나온 경우에는 오른쪽의 문자열들을 반환함
                List<String> rightList = new ArrayList<>();
                for (int j = i + 1; j < str_list.length; j++) {
                    rightList.add(str_list[j]);
                }

                return rightList.toArray(new String[0]);
            } else {
                // "l"이나 "r"이 아닌 경우, 결과 리스트에 추가함
                result.add(str_list[i]);
            }
        }

        return new String[0];
    }
}