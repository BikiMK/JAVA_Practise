package basics2;

import java.util.Scanner;

public class question2 {
    public static void main(String[] args) {
//        Find Maximum and Minimum value

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter "+n+" Elements: ");

        for(int i = 0; i<arr.length; i++){
            arr[i]=sc.nextInt();
        }

        int max = arr[0];
        int min = arr[0];

        for(int i = 0; i<arr.length; i++){
            if(arr[i]>max){
                max = arr[i];
            }

            if(arr[i]<min){
                min = arr[i];
            }
        }
            System.out.println("Max: "+max);
            System.out.println("Min: "+min);



//        for(int i = 0; i<arr.length; i++){
//            if(arr[i]<min){
//                min = arr[i];
//            }
//        }

    }
}
