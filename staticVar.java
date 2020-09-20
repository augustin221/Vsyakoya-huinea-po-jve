public class staticVar {
    public static void main() {
        Person tom = new Person();
        Person bob = new Person();

        tom.displayInfo();
        bob.displayInfo();
        System.out.println(Person.counter);

        Person.counter = 8;

        Person sam = new Person();
        sam.displayInfo();
    }
}

class Person {
    private int id;
    static int counter = 1;

    Person() {
        id = counterId() {
            System.out.println(id);
        }
    }
}
