package basics2;
import java.util.Scanner;
public class ques19 {
    public static void main(String[] args) {
        // reverse words in a String

        System.out.println(reverseWords("the sky is blue"));

    }

    static String reverseWords(String s){
        String[] words=s.split(" +");
        StringBuilder sb = new StringBuilder();
        for (int i = words.length-1; i>=0; i--){
            sb.append(words[i]);
            sb.append(" ");
        }
        return sb.toString().trim();
    }


}
