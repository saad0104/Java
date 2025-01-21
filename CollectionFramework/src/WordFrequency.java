import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WordFrequency {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Map<String, Integer> WFreq = new HashMap<>();

        String str = scan.nextLine();
        scan.close();
        String[] Token = str.split(" ");

        for (String st : Token) {
            WFreq.put(st, 0);
        }

        int count = 0;

        for (int i = 0; i < Token.length; i++) {
            String w = Token[i];
            count = WFreq.get(w);

            if (count == 0) {
                count = 1;
            } else {
                count++;
            }
            WFreq.put(w, count);
        }
        System.out.println(WFreq);
        for(String st : WFreq.keySet())
        {
            System.out.println(st +" " + WFreq.get(st));
        }
    }
}
