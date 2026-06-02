package basics2;

public class ques13 {
    public static void main(String[] args) {
        // Remove special characters from a string
        String str = "@%ja!vas%t$ar";
//        Approach 1
        String newString = str.replaceAll("[^a-zA-z0-9]", "");
        System.out.println(newString);
    }
}
