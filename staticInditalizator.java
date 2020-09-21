public class staticInditalizator {
    public static void main(String[] args) {
        Person tom = new Person();
        Person bob = new Person();

        tom.displayId();
        bob.displayId();
    }
}

/**
 * Person
 */
public class Person {

    private int id;
    static int counter;

    static {
        counter = 105;
        System.out.println("static иницыализатор");
    }

    Person() {
        id = counter++;
        System.out.println("констурктор, constructor , хуй");
    }

    public void displayId() {
        System.out.printf("id :% , m ", id);
    }

}