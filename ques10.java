package basics2;

import java.util.Scanner;

public class ques10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Step 1: Take array size
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        // Step 2: Create array
        int[] arr = new int[n];

        // Step 3: Take array elements
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Step 4: Insertion Sort
        for (int i = 1; i < n; i++) {

            int key = arr[i];     // element to be inserted
            int j = i - 1;        // index of sorted part

            // Shift elements greater than key
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            // Insert key at correct position
            arr[j + 1] = key;
        }

        // Step 5: Print sorted array
        System.out.println("Sorted array:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}
