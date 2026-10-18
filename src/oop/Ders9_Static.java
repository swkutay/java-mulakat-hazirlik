package oop;

class Counter {

    static int totalCount = 0;

    int id;

    Counter() {
        totalCount++;
        id = totalCount;
    }

    static int getTotalCount() {
        return totalCount;
    }

    void showId() {
        System.out.println("My id: " + id);
    }
}

class MathUtil {

    static final double PI = 3.14159;

    static int square(int x) {
        return x * x;
    }

    static double circleArea(double r) {
        return PI * r * r;
    }

}

public class Ders9_Static {

    static void sayHi() {
        System.out.println("Hello from static method");
    }

    void instanceMethod() {
        System.out.println("Hello from instance method");
    }

    public static void main(String[] args) {

        System.out.println(MathUtil.square(5));
        System.out.println(MathUtil.circleArea(2));

        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();

        c1.showId();
        c3.showId();
        System.out.println(Counter.getTotalCount());
        System.out.println(Counter.totalCount);

        sayHi();

        Ders9_Static obj = new Ders9_Static();
        obj.instanceMethod();
    }
}
