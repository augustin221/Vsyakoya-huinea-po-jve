public class staticMetod {
    public static void main(String[] args) {
        Person.displayCounetr();

        Person tom = new Person();
        Person bob = new Person();

        Person.displayCounetr();
    }
}

/**
 * Person
 */
public class Person {
    private int id;
    private static int counter = 1;

    Person() {
        id = counter++;
    }

    public static void displayCounetr() {
        System.out.printf(counter);
    }

    public void displayCounetr() {
        System.out.printf(id);
    }

}