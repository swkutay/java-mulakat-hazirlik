package temeller;

public class Ders1_Baslangic {
    public static void main(String[] args) {

        //variables with primitive types
        int age = 25;
        double price = 19.99;
        boolean isActive = true;
        char grade = 'A';

        //reference type
        String name = "LeBron";

        // constant: value cannot change
        final int Max_Users = 100;

        // arithmetic operators
        int a = 7;
        int b = 2;
        System.out.println(a + b);
        System.out.println(a / b);
        System.out.println(a % b);
        System.out.println((double) a / b);

        // comparison and logical operators
        System.out.println(a > b);
        System.out.println(a > b && b > 5);
        System.out.println(a > b || b > 5);

        // printing variables
        System.out.println(name + " is " + age + " years old");
    }
}