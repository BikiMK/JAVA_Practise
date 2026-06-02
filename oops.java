package basics2;

public class oops {
    public static void main(String[] args) {

        Dog d1 = new Dog();
        d1.name = "Tommy";
        d1.age = 23;
        d1.bark();
        d1.walk();

        Dog d2 = new Dog();
        d2.name = "Sheru";
        d2.age = 23;
        d2.walk();


        if (d1.age == d2.age){
            System.out.println("Same");
        }else {
            System.out.println("Not same");
        }
       if (d1.name == d2.name){
            System.out.println("Same");
        }else {
            System.out.println("Not same");
        }






    }
}




class Dog { // factory
    String name;
    int age;
    String color;

    void walk() {
        System.out.println(name+ " is walking");
    }

    void bark(){
        System.out.println(name+" is barking");
    }


    }

class Cat {

}