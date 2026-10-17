package temeller;

public class Ders4_Metotlar {

        static void sayHello() {
            System.out.println("Hello World");
        }

        static int add(int a, int b) {
            return a + b;
        }

        static double add(double a, double b) {
            return a + b;
        }

        static int add(int a, int b, int c) {
            return a + b + c;
        }

        static boolean isEven(int number) {
            return number % 2 == 0;
        }

        static void tryToChange(int x) {
            x = 100;
        }

        static int factorial(int n) {
            if (n <= 1) {
                return 1; // base case: stops the recursion
            }
            return n * factorial(n - 1);
        }

    public static void main(String[] args) {

        sayHello();

        int sum = add(3, 4);
        System.out.println(sum);

        System.out.println(add(2.5, 3.5));
        System.out.println(add(1, 2, 3));

        System.out.println(isEven(8));

        int value = 5;
        tryToChange(value);
        System.out.println(value);

        System.out.println(factorial(5));
    }
}
