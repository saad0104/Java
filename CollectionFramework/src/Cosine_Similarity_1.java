import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Cosine_Similarity_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String D1 = scan.nextLine();
        // scan.close();
        String D2 = scan.nextLine();
        scan.close();

        String Cat = D1 + " " + D2;

        Map<String, Integer> ST = new HashMap<>();    

        String[] Token = Cat.split(" ");

        for (String str : Token) {
            ST.put(str, 0);
        }

        String[] DT1 = D1.split(" ");
        String[] DT2 = D2.split(" ");

        Map<String, Integer> ST1 = new HashMap<>();
        Map<String, Integer> ST2 = new HashMap<>();

        for (String str : DT1) {
            ST1.put(str, ST1.getOrDefault(str, 0) + 1);
        }

        for (String str : DT2) {
            ST2.put(str, ST2.getOrDefault(str, 0) + 1);
        }

// ST2.getOrDefault(str,0) -->> returns(int) how many times 'str' is in the map 'ST1' . If 'str' is not found in 'ST1' then puts the default value '0'.

        System.out.println(ST1);
        System.out.println(ST2);

        double dotProduct = 0.0;
        double sc1 = 0.0;
        double sc2 = 0.0;

        for (String key : ST.keySet()) {
            int freq1 = ST1.getOrDefault(key, 0);
            int freq2 = ST2.getOrDefault(key, 0);

            dotProduct += freq1 * freq2;
            sc1 += Math.pow(freq1, 2);
            sc2 += Math.pow(freq2, 2);

        }

        // System.out.println(dotProduct);
        // System.out.println(sc1 + " " + sc2);

        double cosineSim = dotProduct / (Math.sqrt(sc1) * Math.sqrt(sc2));

        System.out.println("Cosine Similarity : " + cosineSim);

    }
}