package basics2;

import java.util.Scanner;

public class newMain {
    public static void main(String[] args) {

       Scanner sc = new Scanner (System.in);
        System.out.println("Enter the length of array: ");
        int num = sc.nextInt();
        int [] arr = new int[num];


        System.out.println("Enter all the array elements: ");
        for (int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Your values are: ");
        for (int i =0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
        sc.close();


    }
}
