package basics2;

public class ques14 {
    public static void main(String[] args) {

        String str = "javastar";

        // Step 1: Convert string to char array
        char[] arr = str.toCharArray();

        // Step 2: Selection Sort on char array
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // swap characters
            char temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }

        // Step 3: Convert back to String
        String sortedString = new String(arr);

        System.out.println(sortedString);
    }
}
