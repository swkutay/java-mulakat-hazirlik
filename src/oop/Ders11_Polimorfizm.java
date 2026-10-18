package oop;

class Shape {
    String name;

    Shape(String name) {
        this.name = name;
    }

    double area() {
        return 0;
    }

    void describe() {
        System.out.println(name + " with area " + area());
    }
}

class Circle extends Shape {
    double radius;

    Circle(double radius) {
        super("Circle");
        this.radius = radius;
    }

    @Override
    double area() {
        return 3.14 * radius * radius;
    }
}

class Rectangle extends Shape {
    double width;
    double height;

    Rectangle(double width, double height) {
        super("Rectangle");
        this.width = width;
        this.height = height;
    }

    @Override
    double area() {
        return width * height;
    }
}

public class Ders11_Polimorfizm {

    static void printArea(Shape s) {
        System.out.println(s.name + ": " + s.area());
    }

    static int sum(int a, int b) {
        return a + b;
    }

    static double sum(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {

        Shape s1 = new Circle(2);
        Shape s2 = new Rectangle(3, 4);
        Shape s3 = new Shape("Unknown");

        printArea(s1);
        printArea(s2);
        printArea(s3);

        s1.describe();

        Shape[] shapes = { new Circle(1), new Rectangle(2, 5), new Circle(2) };
        for (Shape shape : shapes) {
            System.out.println(shape.name + ": " + shape.area());
        }

        Shape s = new Circle(5);
        if (s instanceof Circle) {
            Circle c = (Circle) s;
            System.out.println(c.radius);
        }

        System.out.println(sum(2, 3));
        System.out.println(sum(2.5, 3.5));
    }
}
