package basics2.recursion;

public class ques2 {

//    Print ur name 5 times

    static void newPrint(int n){
        if (n == 5){
            return;
        }
        else {
            System.out.println("Biki");
            newPrint(n+1);
        }
    }

    public static void main(String[] args) {
        newPrint(0);
    }
}
