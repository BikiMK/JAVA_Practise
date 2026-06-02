package basics2;

public class array {
    public static void main(String[] args) {
//        Arrays are stored in contiguous memory, used to store same types of data
//        int[] intArray;
//        intArray = new int[20]; // Allocating memory to array

//        int age[]; // declaration
//
//
//        age = new int[5]; // Allocation


//        int age[] = new int[5]; // declared in single line
//        age[0] = 5; // address of 0 = index*size
//        age[1] = 2;
//        age[2] = 235;
//        age[3] = 52;
//        System.out.println(age[0]);
//        System.out.println(age[1]);
//        System.out.println(age[4]);
//
//        // In java if we want to increase a number, suppose there is a 5 length array and at-first we have added 5 numbers but then we suppose to
//        // add 1 or 2 more number then it is not possible then we have to make an another array then re add all the data to it
//
//        System.out.println(age.length); // length of an array


        // Initialization of Array

        int [] marks = new int [3];

        marks[0] = 97;
        marks[1] = 98;

        marks[2] = 93;

        System.out.println(marks[1]);
        for (int i =0; i<3; i++){
            System.out.println(marks[i]);
        }





    }
}
