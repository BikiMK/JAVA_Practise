package basics2;

import java.util.Scanner;

public class ques7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of an array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements (sorted):");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the number you want to search: ");
        int key = sc.nextInt();

        int left = 0;
        int right = arr.length - 1;

        boolean found = false;

        while (left <= right) {

            int middle = (left + right) / 2;

            if (key == arr[middle]) {
                System.out.println("Element found at index " + middle);
                found = true;
                break;
            }
            else if (key < arr[middle]) {
                right = middle - 1;
            }
            else {
                left = middle + 1;
            }
        }

        if (!found) {
            System.out.println("Element not found");
        }

        sc.close();
    }
}
