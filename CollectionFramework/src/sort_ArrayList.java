import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class sort_ArrayList {
    private static final String suits[] = {"Heart", "Diamonds", "Clubs", "Spades"};

    public static void main(String[] args) {

        // List listt = new ArrayList<>(Arrays.asList(suits));
        List list = (Arrays.asList(suits));

        System.out.println("*Unsorted ArrayList " + list);

        Collections.sort(list);
        System.out.println("*Sorted ArrayList " + list);

        Collections.sort(list, Collections.reverseOrder());
        System.out.println("*Reversed ArrayList " + list);

    }
}
