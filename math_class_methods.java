package basics2;

public class math_class_methods {
    public static void main(String[] args) {
        int a =4;
        int b = 7;
        System.out.println(Math.min(a,b));
        System.out.println(Math.sqrt(a));
        System.out.println(Math.pow(a, b));
        System.out.println(getRandom() + 1);
    }
     public static int getRandom(){
        return (int) (Math.random()*6);
     }


}
