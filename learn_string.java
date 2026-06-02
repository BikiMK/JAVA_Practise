package basics2;

import java.util.Scanner;
import java.util.*;

public class learn_string {
    public static void main(String[] args) {
        // String Declaration
//        String name = "Tony";
//        String fullName = "Tony Stark";
////        string sentence = "My name is Tony Stark";
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter ur name: ");
//        String userName = sc.next();
//        System.out.println("ur name is: "+userName);

//        // Concatenation
//        String firstName = "Tony";
//        String lastName = "Stark";
//        String fullName = firstName+" "+ lastName;
//        System.out.println(fullName.length());
//
//        // charAt
//        for (int i = 0 ; i<fullName.length();i++ ){
//            System.out.println(fullName.charAt(i));
//        }


        // Comparison
//        String name1 = "Tony";
//        String name2 = "Tony";

//        if (name1.compareTo(name2)==0){
//            System.out.println("String are equal");
//        }else {
//            System.out.println("Strings are not equal");
//        }

//        if (name1 == name2){
//            System.out.println("String are equal");
//        }else {
//            System.out.println("Strings are not equal");
//        } // we donot use this bcoz in most of the cases it gives false ans. eg given below

//        if (new String("Tony") == new String("Tony")){
//            System.out.println("Strings are equal");
//        }else {
//            System.out.println("Strings are not equal");
//        }


        //SubString
//        String sentence = "My name is Tony";
//        String name = sentence.substring(11);
//        System.out.println(name);

//        String Builder
        StringBuilder sb = new StringBuilder("Tony");
//        System.out.println(sb);

//        char at index 0
//        System.out.println(sb.charAt(0));

//        set char at index
        sb.setCharAt(0, 'P');
        System.out.println(sb);

//        insert char at any index
        sb.insert(0, 'N');
        System.out.println(sb);

//        delete char at any index
        sb.delete(2, 3);
        System.out.println(sb);

//        Append char at index
        sb.append("e");
        System.out.println(sb);


    }
}
