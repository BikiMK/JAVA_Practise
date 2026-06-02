package basics2;

public class ques16 {
    public static void main(String[] args) {

        String str = "java is fun";
        StringBuilder result = new StringBuilder();

        int start = 0;  // starting index of a word

        for (int i = 0; i < str.length(); i++) {

            // when space is found, word ends
            if (str.charAt(i) == ' ') {

                // reverse the word from start to i-1
                for (int j = i - 1; j >= start; j--) {
                    result.append(str.charAt(j));
                }

                // add space after reversing word
                result.append(' ');

                // next word starts after space
                start = i + 1;
            }
        }

        // reverse the last word (no space after it)
        for (int j = str.length() - 1; j >= start; j--) {
            result.append(str.charAt(j));
        }

        System.out.println(result.toString());
    }
}
