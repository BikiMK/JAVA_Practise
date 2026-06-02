package basics2;

import java.util.Arrays;

public class ques15 {
    public static void main(String[] args) {

//  using sort method, sort string characters

        String str = "javastar";

        // Step 1: Convert String to char array
        char[] arr = str.toCharArray();

        // Step 2: Sort the char array
        Arrays.sort(arr);

        // Step 3: Convert sorted char array back to String
        String sortedString = new String(arr);

        System.out.println(sortedString);
    }
}
