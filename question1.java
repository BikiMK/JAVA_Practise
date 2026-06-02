package basics2;

import java.util.Scanner;

public class question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
//        System.out.println("Array length is: "+n);
        System.out.println("Enter "+n+" Elements: ");

        for (int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        int sum = 0;
        for(int i = 0; i< arr.length; i++ ){
            sum = sum+arr[i];
        }
        System.out.println("The sum is: "+sum);

        sc.close();


    }
}
