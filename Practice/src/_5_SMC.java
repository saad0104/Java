import java.util.Scanner;

public class _5_SMC {
    public static void main(String[] args) {

        String str1, str2;
        Scanner scan = new Scanner(System.in);

        str1 = scan.nextLine();
        str2 = scan.nextLine();
        
        System.out.println("SMC: " + SMC(str1,str2));
    }

    public static double SMC(String str1, String str2) {
        double sim = 0;

        int f10 = 0, f11 = 0, f01 = 0, f00 = 0;

        for (int i = 0; i < str1.length(); i++) {

            char a = str1.charAt(i);
            char b = str2.charAt(i);
            if (a == '0' && b == '0') {
                f00++;
            }
            if (a == '0' && b == '1') {
                f01++;
            }
            if (a == '1' && b == '0') {
                f10++;
            }
            if (a == '1' && b == '1') {
                f11++;
            }
        }
        sim = (double)(f00 + f11) / (double)(f00 + f11 + f01 + f10);

        return sim;

    }
}
