import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CoSIMPrac {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str1 = scan.nextLine();
        String str2 = scan.nextLine();
        scan.close();
        String cat = str1 + " " + str2;
        String[] Token = cat.split(" ");

        Map<String, Integer> ST = new HashMap<>();

        for (String st : Token) {
            ST.put(st, 0);
        }
        Map<String, Integer> SS1 = new HashMap<>();
        Map<String, Integer> SS2 = new HashMap<>();

        String[] S1 = str1.split(" ");
        String[] S2 = str2.split(" ");

        for (String st : S1) {
            SS1.put(st, SS1.getOrDefault(st, 0) + 1);
        }
        for (String st : S2) {
            SS2.put(st, SS2.getOrDefault(st, 0) + 1);
        }
        double dp = 0.0, m1 = 0.0, m2 = 0.0;

        for (String st : ST.keySet()) {

            int f1 = SS1.getOrDefault(st, 0);
            int f2 = SS2.getOrDefault(st, 0);

            dp += f1 * f2;
            m1 += Math.pow(f1, 2);
            m2 += Math.pow(f2, 2);
        }

        double c = dp / (Math.sqrt(m1) * Math.sqrt(m2));
        System.out.println("Cosine Similarity: " + c);
    }
}
