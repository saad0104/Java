import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionTest {
    public static void main(String[] args) {
        List<String> a1 = new ArrayList<>();
        a1.add("mango");
        a1.add("orange");
        a1.add("grapes");
        for (String fruit : a1) {
            System.out.println();

        }
        System.out.println();

        Collections.sort(a1);

        for (String fruit : a1) {
            System.out.println(fruit);
        }
        System.out.println();

        // Searching for an elememt.

        String key = "mango";

        System.out.println("\nSearching for: " + key);
        int result = Collections.binarySearch(a1, key);
        System.out.println((result >= 0 ? "Found at index " + result
                : "Not Found (" + result + ")"));

    }
}
