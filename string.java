package basics2;

public class string {
    public static void main(String[] args) {
        String name = "Subho";
        String sameName = "Subho";
        String newName = new String("Subho");


        System.out.println(name);
        System.out.println(newName);

        System.out.println("Subho Mukherjee");

//        if (name == sameName){
//            System.out.println("Yes");
//        }else{
//            System.out.println("No");
//        }
//
//        if (name == newName){
//            System.out.println("Yes");
//        }else{
//            System.out.println("No");
//        }



         if (name.equals(newName)){
             System.out.println("Same value");
         }else{
             System.out.println("not same");
         }



         // That means in name.equals the value is checking that it is same or not but in previous if else the storage path is checking that swhy it is telling that "NO"



        if (name.equalsIgnoreCase(newName)){
            System.out.println("Same");
        }else{
            System.out.println("Not same");
        }
    }
}
