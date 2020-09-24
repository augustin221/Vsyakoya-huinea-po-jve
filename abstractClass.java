package java;

public class abstractClass {
    public static void main(String[] args) {
        Employee sam = new Employee("sam", "zalupa");
        sam.display();
        Client bob = new Clien("zalupa", "letherHands brother");
        bob.display();
    }
}

abstract class Person {
    private String name;

    public String getName() {
        return name;
    }

    public Person(String name) {
        this.name = name;
    }

    public abstract void display();
}

class Employee extends Person {
    private String bank;

    public Employee(String name, String company) {
        super(name);
        this.bank = company;
    }

    public void display() {
        System.out.printf("employyee", super.getName(), bank);
    }
}

class Clien extends Person {
    private String bank;

    public Clien(String name, String company) {
        super(name);
        this.bank = company;
    }
}
