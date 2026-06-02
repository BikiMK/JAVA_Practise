package basics2;

import java.util.Scanner;

public class ques18 {
    public static void main(String[] args) {

        // Leetcode 58: Length of last word

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your string: ");
        String sr = sc.nextLine();

        // store trimmed string
        sr = sr.trim();

        int count = 0;

        for (int i = sr.length() - 1; i >= 0; i--) {
            if (sr.charAt(i) == ' ') {
                break;
            }
            count++;
        }

        System.out.println(count);
    }
}
