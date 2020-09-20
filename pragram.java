public class pragram {
    public static void main(String argc[]) {
        System.out.println(2);
        System.out.println(6);
        System.out.println(14);
        System.out.println(19);
    }

    int[] numbs2 = new int[3];
        try{
        numbs2[5] = 45;
        numbs2[6] = Integer.parseInt("gfd");
    }
    catch(ArrayIndexOutOfBondesException ex) {
        System.out.println("выход за перделы масева блядь");
    }
    catch(NumberFormatException ex) {
        System.out.println("залупа")
    }

    static void daytime(int hour) {
        if (hour > 24 || hour < 0)
            return;

        if (hour > 10 || hour < 0)
            System.out.println("залупа");
        if (hour > 10 || hour < 0)
            System.out.println("залупа двач");
    }

    static int func(int x) {
        int result = 1;

        for (int i = 1; i <= x; i++) {
            result *= i;
        }
        return result;
    }

    static int func2(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        else {
            return func2(n - 1) + func2(n - 1);
        }
    }

    try {
        int[] number = new int[3];
        number[4] = 45;
        System.out.println(number[4]);
    }catch(
    Exception ex)
    {
        ex.printStackTrace();
    }
      finally
        {
            System.out.println("блок конца бляь");
        }System.out.println("хуй те рот");
    } 
}
