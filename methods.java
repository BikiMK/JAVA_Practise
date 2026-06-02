package basics2;
import java.util.Scanner;

public class methods {
    public static void main(String[] args) {
//functions and java are same
//        a method is a block of code or a set of code grouped together to perform a certain task or operation, it is used to achieve the reusability the code

//        greet();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number: ");
        int numb1 = sc.nextInt();
        System.out.println("Enter 2nd number: ");
        int numb2 = sc.nextInt();
        average(numb1, numb2);




        // Method Parameters: a method parameter is a vlue accepted by the method. as mentioned earlier, a method can also have any number of parameters. basically its the input
    }

       static void greet() {
            System.out.println("Hello World!");
        }

        public static int average(int a, int b){
        int avg = (a + b)/2;
            System.out.println("The avg is: "+avg);
            return avg;
        }



//        public void average(int a, int b){
//
//        }



}
