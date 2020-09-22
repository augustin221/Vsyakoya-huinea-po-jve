public class metod {

    public static void main(String[] args) {

        Person.displayCounter(); // Counter: 1

        Person tom = new Person();
        Person bob = new Person();

        Person.displayCounter(); // Counter: 3
    }
}

class Person {

    private int id;
    private static int counter = 1;

    Person() {
        id = counter++;
    }

    // статический метод
    public static void displayCounter() {

        System.out.printf("Counter: %d \n", counter);
    }

    public void displayId() {

        System.out.printf("Id: %d \n", id);
    }
}