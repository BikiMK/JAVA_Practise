package basics2.recursion;

public class ques1 {

    static int factorial (int n){
//        factorial (n)= n * n-1 * n-2
//        factorial 5 = 5 * 4 * 3 * 2 * 1 = 120
//        factorial 0 = 1

        if(n == 0 || n == 1){
            return 1;
        }
        else{
            return n * factorial(n-1);
        }


    }

    public static void main(String[] args) {
        System.out.println(factorial(5));
    }


}
