import java.util.Scanner;

class Exceeds extends Exception {
    Exceeds(String message) {
        super(message);
    }
}

public class ValueExceeds {
    public static void main(String[] args){
        
        System.out.println("Enter a value");
        Scanner Scan = new Scanner(System.in);
        int i = Scan.nextInt();
        // Scan.close();
        try {
            if (i < 100) {
                System.out.println("100 er Kom");
            }

            else {
                throw new Exceeds("100 er beshi");

            }
        } catch (Exceeds e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Khel Khatam");
        }
    }

}
