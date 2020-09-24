package java;

public class NasledstvieMetod {
    public static void main(String[] args) {
        Employee sam = new Employee("sam", "micforofst");
        sam.display();
    }
}

class Person {
    private String name;

    public String getName() {
        return name;
    }

    public Person(String name) {
        this.name = name;
    }

    public void display() {
        System.out.println("hui" + name);
    }
}

class Employee extends Person {
    private String company;

    public Employee(String name, String company) {
        super(name);
        this.company = company;
    }

    public void display() {
        System.out.printf(getName());
        System.out.printf(company);
    }
}