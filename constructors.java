package basics2;

import java.util.Scanner;

public class constructors {
    public static void main(String[] args) {
        // instance and objects are same things
//        two rules of constructors:
        // a. The name of the constructor should be the same as the class
        // b. a java constructor must not have a return type

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first num: ");
        int numb1 = sc.nextInt();
        System.out.println("Enter the second num: ");
        int numb2 = sc.nextInt();

        Complex num1 = new Complex();
        num1.print(numb1, numb2);
    }
}

class Complex {
    int a, b;
    public Complex() {
        System.out.println("Created a new obj");
    }
    void print(int a, int b){
        System.out.println(a+" + "+b+"i");
    }
}