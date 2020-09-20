import java.util.Scanner;

public class java {
    public static void main(String[] argc) {
        Scanner in = new Scanner(System.in);
        System.out.print("input name :");
        String name = in.nextLine();
        String age = in.nextLine();
        System.out.print("input age");
        System.out.print("input height");
        float height = in.nextFloat();
        System.out.printf("name : %", name, age, height);

        in.close();
    }
}
