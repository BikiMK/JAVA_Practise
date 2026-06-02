package basics2;
import java.util.Scanner;

public class ques9 {
    public static void main(String[] args) {
        // Selection Sort


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in array: ");
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.println("Enter "+n+" elements: ");
        for (int i = 0; i<arr.length; i++){
            arr[i]=sc.nextInt();
        }
        int m = arr.length;
        for (int i = 0; i<m-1; i++){
        int minIndex = i;
            for(int j = i+1; j<m; j++){
                if(arr[j]<arr[minIndex]){
                    minIndex = j;
                }
            }

            // swap after finding smallest
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
        System.out.println("Sorted array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
