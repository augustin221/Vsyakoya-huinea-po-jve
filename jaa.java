public class jaa {
    public static void main(String[] argc) {
        Person tom = new Person();
        tom.displayinfo();

        tom.name = "tom";
        tom.age = 21;
        tom.displayinfo();
    }

    class Person {
        String name;
        int age;

        void displayinfo() {
            System.out.printf("Name: %s \tAge: %d\n", age, name);
        }
    }
}
