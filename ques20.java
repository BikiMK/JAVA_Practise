package basics2;

public class ques20 {
    public static void main(String[] args) {
        // Count total char in a String
        String str = "Hello Java";
        int count = 0;
        for (int i=0; i<str.length(); i++){
            if(str.charAt(i) != ' '){
                count++;
            }
        }
        System.out.println(count);

    }

}
