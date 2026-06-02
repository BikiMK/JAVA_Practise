package basics2;

import java.util.Scanner;

public class ques8 {
    public static void main(String[] args) {

        // Bubble Sorting

        Scanner sc = new Scanner(System.in);

        System.out.print("Size of an array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // Bubble Sort
        for (int i = 0; i < arr.length - 1; i++) {          // passes
            for (int j = 0; j < arr.length - 1 - i; j++) {  // comparisons
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.println("Sorted array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}
