import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String answer = sc.next();
        for (int i = 0; i < answer.length(); i++) {
            if (answer.length() <= 10) {
                System.out.println(answer.charAt(i));
            }
        }
    }
}