public class innerClass {
    public static void main(String[] args) {
        Person tom = new Person("tom", "qwerty");
        tom.displayPerson();
        tom.account.displayAccount();
    }
}

class Person {
    private String name;
    Account account;

    Person(String name, String password) {
        this.name = name;
        account = new Account(password);
    }

    public void displayPerson() {
        System.out.printf(name, account.password);
    }

    public class Account {
        private String password;

        Account(String pass) {
            this.password = pass;
        }

        void displayAccount() {
            System.out.printf("залупа", Person.this.name, password);
        }

    }
}