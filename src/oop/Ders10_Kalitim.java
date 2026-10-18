package oop;

class Employee {
    String name;
    double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    void work() {
        System.out.println(name + " is working");
    }

    double yearlySalary() {
        return salary * 12;
    }
}

class Manager extends Employee {
    int teamSize;

    Manager(String name, double salary, int teamSize) {
        super(name, salary);
        this.teamSize = teamSize;
    }

    @Override
    void work() {
        System.out.println(name + " is managing a team of " + teamSize);
    }

    void holdMeeting() {
        System.out.println(name + " is holding a meeting");
    }
}

class Developer extends Employee {
    String language;

    Developer(String name, double salary, String language) {
        super(name, salary);
        this.language = language;
    }

    @Override
    void work() {
        super.work();
        System.out.println("...and writing " + language + " code");
    }
}

public class Ders10_Kalitim {

    public static void main(String[] args) {

        Employee e = new Employee("Messi", 1000);
        Manager m = new Manager("Ronaldo", 3000, 5);
        Developer d = new Developer("Osimhen", 2000, "Java");

        e.work();
        m.work();
        d.work();

        System.out.println(m.yearlySalary());
        m.holdMeeting();

        Employee x = new Manager("Icardi", 2500, 3);
        x.work();

        System.out.println(m instanceof Employee);
        System.out.println(e instanceof Manager);
    }
}
