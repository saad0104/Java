import java.util.HashSet;
import java.util.Set;


// Jaccard Similarity is 0.444

public class _4_JaccardSimilarity {
    public static void main(String[] args) {
        String doc1 = "Data is the new oil of the digital economy";
        String doc2 = "Data is a new oil";

        Set<String> str1 = new HashSet<String>();
        Set<String> str2 = new HashSet<String>();

        for (String word : doc1.split(" ")) {
            str1.add(word);
        }
        for (String word : doc2.split(" ")) {
            str2.add(word);
        }

        Set<String> union = new HashSet<String>(str1);
        Set<String> intersection = new HashSet<String>(str1);

        union.addAll(str2);
        intersection.retainAll(str2);

        System.out.format("Jaccard Similarity: %.4f", ((double) intersection.size() / (double) ((union.size()))));

    }
}
