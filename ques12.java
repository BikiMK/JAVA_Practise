package basics2;



public class ques12 {
    public static void main(String[] args) {
        // Remove white spaces
        String str = "    ja va st a r    ";

//        String trimmed = str.trim(); // use only trim leading and lagging spaces
        String trimmed = str.replaceAll("\s", "");
        System.out.println(trimmed);


    }
}
