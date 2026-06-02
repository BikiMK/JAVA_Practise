package basics2;

public class Method_overloading {
    public static void main(String[] args) {
        // two or more methods can have the same name inside the same class if they accept different arguments. This feature is known as method overloading.
        // method overloading is achieved by either:
        //      a. changing the number of arguments
        //      b. changing the data type of arguments

        greet obj = new greet();
        obj.greetings();
        obj.greetings("Subho");


    }
}



class greet{
    void greetings(){
        System.out.println("Hello good mrng");
    }

     void greetings (String name) {
         System.out.println("Hello! "+name+" Gd mrng");
     }

     // here you can use multiple number of class with same names

}
