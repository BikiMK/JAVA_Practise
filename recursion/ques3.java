package basics2.recursion;

public class ques3 {

    static void newPr(int n){

        // Base case
        if(n == 0){
            return;
        }

        // Recursive call
        newPr(n - 1);

        // Work (printing)
        System.out.println(n);
    }

    public static void main(String[] args) {
        newPr(4);
    }
}
