package basics2;

public class problems_on_arrays {
    public static void main(String[] args) {
        int numbers [] = {23, 12, 6, 7, 15, 3, 2, 56};
        int sum = 0;
//        for ( int number: numbers){
//            sum += number;
//        }
//            System.out.println("Sum is: " + sum);
//        for (int i = 0; i < numbers.length; i++){
//            sum += numbers[i];
//
//        }
//        System.out.println(sum);

//        int min = numbers[0]; // Initialization
//
//        for (int number: numbers){
//            if (number<min){
//                min = number;
//            }
//        }
//
//        System.out.println("minimum is: " +min);


        int marks [][] = new int [4] [3]; // 4 rows and 3 columns

        // Row = student roll number
        // Column = student marks in subjects

        // lets store roll 0 all the marks
        marks[0][0]= 12;
        marks[0][1]= 98;
        marks[0][2]= 34;

        // lets store roll 1 all the marks

        marks[1][0]= 12;
        marks[1][1]= 67;
        marks[1][2]= 87;

        System.out.println(marks[1][2]);





    }
}
