package basics2.recursion;

public class ques4 {
    static int summation(int n){
        if (n == 0){
            return 0;
        }
        return n + summation(n-1);

    }

    public static void main(String[] args) {
        int result = summation(5);
        System.out.println(result);
    }
}
