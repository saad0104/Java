import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;

public class _10_Players_Salary {
    public static void main(String[] args) throws FileNotFoundException {

        HashMap<String, Integer> mp = new HashMap<>();
        FileReader fr = new FileReader("src\\salary.txt");
        try {
            BufferedReader bf = new BufferedReader(fr);

            String line;
            while ((line = bf.readLine()) != null) {

                String[] parts = line.split("\\t");
                // if (parts.length == 2) {
                String name = parts[0];
                String salary = parts[1];
                if (!salary.equals("Null")) {

                    mp.put(name, Integer.parseInt(salary));
                }
                // fr.close();
                // }

            }

            System.out.println(mp);
            // System.out.println(mp.get("Player A"));
            if (mp.containsKey("Player A") && mp.get("Player A") != null) {
                mp.put("Player A", mp.get("Player A") + 50000);
            }
            System.out.println(mp.get("Player A"));
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
