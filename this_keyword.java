//package basics2;
//
//public class this_keyword {
//    public static void main(String[] args) {
//        // 'this' keyword is used to refer to the current object inside a method or constructor
//
//        Complex num1 = new Complex(2, 4);
//        Complex num2 = new Complex(4, 1);
//
//        System.out.println("Adding two nums: ");
//        Complex result = num1.add(num2);
//        result.print();
//    }
//}
//
//class Complex {
//    int a, b;
//
//    public Complex(int real, int imaginary) {
//        a = real;
//        b = imaginary;
//        System.out.println("Created a new obj");
//    }
//
//    void print() {
//        System.out.println(a + " + " + b + "i");
//    }
//
//    Complex add(Complex num2) {
//        Complex newNum = new Complex(a + num2.a, b + num2.b);
//        return newNum;
//    }
//}
