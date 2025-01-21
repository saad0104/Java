// SMC =  Simple Matching Coefficient
import java.util.*;

public class SMC {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String st1 = scan.next();
        String st2 = scan.next();
        scan.close();

        int F00=0,F01=0,F10=0,F11=0;

        for(int i=0;i<st1.length();i++)
        {
            if(st1.charAt(i)=='0' && st2.charAt(i)=='0')
            {
                F00++;
            }
            else if(st1.charAt(i)=='0' && st2.charAt(i)=='1')
            {
                F01++;
            }
            else if(st1.charAt(i)=='1' && st2.charAt(i)=='0')
            {
                F10++;
            }
            else if(st1.charAt(i)=='1' && st2.charAt(i)=='1')
            {
                F11++;
            }
        }

        double smc = (F11+F00)*1.0 / (F01 + F10 + F00 + F11);
        System.out.println(smc);
    }
}
