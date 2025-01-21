import java.util.Scanner;

class ValueExceeds extends Exception {
    public ValueExceeds(String str) {
        super(str);
    }
}

public class TestValueExceeds {
    public static void main(String[] args) {
        int t;
        Scanner scan = new Scanner(System.in);
        t = scan.nextInt();
        try {
            if (t > 100) {
                throw new ValueExceeds("Value Should be under 100");
            }
        } catch (ValueExceeds e) {
            System.out.println(e.getMessage());

        } finally {
            System.out.println("Finally Goodbye");
        }

    }
}
