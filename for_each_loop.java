package basics2;

public class for_each_loop {
    public static void main(String[] args) {
        String names[] = {"Ram", "Harish", "Karan", "Monty"};
        for (int i = 0; i < names.length; i++ ){
            System.out.println("Name is: " + names[i]);

//        for each loop

            for(String name: names) { // for each name in names
                System.out.println("For each "+ name);

            }

        }
    }
}
