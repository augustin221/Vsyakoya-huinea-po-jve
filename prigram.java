public class prigram {
    public static void main(String[] argc) {
        person bob = new person();
        bob.displayinfo();

        person tom = new person("tom");
        tom.displayinfo();

        person sam = new person("sam", 25);
        sam.displayinfo();
    }
}

class person()
{
    String name;
    int age;

    person() {
        name = "undefined";
        age = 15;
    }

    person(String n) {
        name = n;
        age = 18;
    }

    person(String n, int a) {
        name = n;
        age = a;
    }

    void displayinfo() {
        System.out.println(name, age);
    }
}