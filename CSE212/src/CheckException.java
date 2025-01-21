// 

import java.util.Scanner;
import java.lang.Exception;

class NoMatchException extends Exception {
    NoMatchException(String message) {
        super(message);
    }
}

public class CheckException {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String S1 = "CSECU";
        String S2 = scan.next();

        try{
            if(S2.matches(S1))
            {
                System.out.println("Match");
            }
            else{
                throw new NoMatchException("Not Match");
            }
        
    }
    catch(NoMatchException e)
    {
        System.out.println(e.getMessage());
    }
    finally{
        System.out.println("Finally Block");
    }
}
}