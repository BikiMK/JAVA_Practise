package basics2;

import java.util.Scanner;

public class question3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > max) {
                secondMax = max;   // old max becomes 2nd max
                max = arr[i];
            }
            else if (arr[i] > secondMax && arr[i] != max) {
                secondMax = arr[i];
            }
        }

        System.out.println("Largest: " + max);
        System.out.println("2nd Largest: " + secondMax);

        sc.close();
    }
}
