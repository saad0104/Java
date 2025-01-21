import java.util.Map;
import java.util.TreeMap;

public class FileMap {
    public static void main(String[] args) {
        Map<Integer, String> map = new TreeMap<>();
        map.put(101, "Structured Programming");
        map.put(102, "Algortihms");
        map.put(103, "Operating Systems");

        System.out.println(map.get(101));
    }
}
