public class innerclasss2 {
    public static void main(String[] args) {
        Person tom = new Person("tom");
        tom.setAccount("qweryty");
    }
}

class Person {
    private String name;

    Person(String name) {
        this.name = name;
    }

    public void setAccount(String password) {
        class Account {
            void display() {
                System.out.printf(name, password);
            }
        }
        Account account = new Account();
        account.display();
    }
}

class Math {
    public static class Factorial {
        private int result;
        private int key;

        public Factorial(int nubmer, int x) {
            result = nubmer;
            key = x;
        }

        public int getResult() {
            return result;
        }

        public int getKey() {
            return key;
        }
    }

    public static Factorial getFactorial(int x) {
        int result = 1;
        for (int i = 1; i <= x; i++) {
            result *= i;
        }
        return new Factorial(result, x);
    }
}