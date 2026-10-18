package oop;

import javax.swing.*;

class Student {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    Student(String name) {
        this(name, 18);
    }

    void introduce() {
        System.out.println("Hi I am " + this.name + " and " + this.age + " years old.");
    }

    void birthday() {
        age++;
    }

    boolean isAdult() {
        return age >= 18;
    }

}

class Box {

    int width;
    String label;
    boolean open;
}

public class Ders7_SinifVeNesne {

    public static void main(String[] args) {

        Student s1 = new Student("James",23);
        Student s2 = new Student("Micheal");

        s1.introduce();
        s2.introduce();

        s1.birthday();
        System.out.println(s1.age);

        System.out.println(s2.isAdult());

        Student s3 = s1;
        s3.name = "Jordan";
        System.out.println(s1.name);

        Box box = new Box();
        System.out.println(box.width);
        System.out.println(box.label);
        System.out.println(box.open);

        Student a = new Student("Harden", 20);
        Student b = new Student("Harden", 20);
        System.out.println(a == b);
    }

}
