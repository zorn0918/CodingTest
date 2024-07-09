import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String output = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (str.length() <= 20) {
                if (Character.isLowerCase(ch)) {
                    output += Character.toUpperCase(ch);
                } else if (Character.isUpperCase(ch)) {
                    output += Character.toLowerCase(ch);
                } else {
                    output += ch;
                }
            }
        }
        System.out.println(output);
    }
}