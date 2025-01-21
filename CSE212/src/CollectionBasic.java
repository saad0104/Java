
import java.util.ArrayList;
import java.util.List;

public class CollectionBasic {
    public static void main(String[] args) {

        List<String> ls = new ArrayList<>();
        ls.add("Hasib");
        ls.add("hasib");
        ls.add("haSIb");
        for (String rm : ls) {
            System.out.println(rm);
        }

    }
}
