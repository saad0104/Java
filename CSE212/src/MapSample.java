
import java.util.HashMap;
import java.util.Map;

public class MapSample {
    public static void main(String[] args) {
        Map<String, Integer> smaplemap = new HashMap<String, Integer>();
        smaplemap.put("Std 1", 60);
        smaplemap.put("Std 2", 70);
        smaplemap.put("Std 3", 80);
        smaplemap.put("Std 4", 90);

        System.out.println(smaplemap);

        System.out.println(smaplemap.get("Std1"));

        for (String mapkey : smaplemap.keySet()) {
            System.out.println(mapkey);
        }

        for (String mapkey : smaplemap.keySet()) {
            System.out.println(smaplemap.get(mapkey));
        }

    }

}
