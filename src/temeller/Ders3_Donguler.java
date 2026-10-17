package temeller;

public class Ders3_Donguler {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            System.out.println("for: " + i);
        }


        int count = 3;

        while (count > 0) {
            System.out.println("while: " + count);
            count--;
        }


        int n = 1;

        do {
            System.out.println("do: " + n);
            n++;
        }while (n < 10);


        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                continue;
            }
            if (i > 7) {
                break;
            }
            System.out.println("odd: " + i);
        }
    }
}
