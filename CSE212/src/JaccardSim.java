import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JaccardSim {
    public static void main(String[] args) {
        String str1 = "Data is the new oil of the digital economy";
        String str2 = "Data is a new oil";

        String[] words1 = str1.split(" ");
        String[] words2 = str2.split(" ");

        Set<String> set = new HashSet<String>();
        Set<String> set2 = new HashSet<String>();

        for (String word : words1) {
            set.add(word);
        }

        for (String word2 : words2) {
            set2.add(word2);
        }

        int similar = 0;
        for (String S1 : set2) {
            for (String S2 : set) {
                if (S1.equals(S2)) {
                    similar++;
                }
            }
        }

        Set<String> combinedSet = Stream.concat(set.stream(), set2.stream())
                .collect(Collectors.toSet());

        // System.out.println(set);
        // System.out.println(set2);
        // System.out.println(combinedSet);

        System.out.println(combinedSet.size());
        System.out.println(similar);

        System.out.printf("%.3f",((similar * 1.0) / combinedSet.size()));

    }

}
