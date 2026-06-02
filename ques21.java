package basics2;


public class ques21 {
    public static void main(String[] args) {
//        Palindrome String

        String str = "level";
//        String rev = "";
//        for(int i=str.length()-1; i>=0; i--){
//            rev=rev+str.charAt(i);
//        }
//        if (str.toLowerCase().equals(rev.toLowerCase())){
//            System.out.println("Palindrome string");
//        }else{
//            System.out.println("Not palindrome");
//        }


//        using by StringBuilder Method
        StringBuilder rev = new StringBuilder();

        for (int i = str.length() - 1; i >= 0; i--) {
            rev.append(str.charAt(i));
        }

        if (str.equalsIgnoreCase(rev.toString())) {
            System.out.println("Palindrome string");
        } else {
            System.out.println("Not palindrome");
        }



    }
}
