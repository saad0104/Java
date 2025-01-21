import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.Buffer;
import java.util.Set;
import java.util.TreeSet;

public class _7_Course_Student {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        File fr1 = new File("cse111.txt");
        File fr3 = new File("cse311.txt");

        try {
            fr1.createNewFile();
            fr3.createNewFile();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            FileWriter fr = new FileWriter("cse111.txt");
            fr.write("stdA, stdB, stdC");
            fr.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            FileWriter frr = new FileWriter("cse311.txt");
            frr.write("stdA, stdB, stdC, stdD, stdE");
            frr.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        Set<String> c111 = new TreeSet<>();

        try (BufferedReader ff = new BufferedReader(new FileReader("cse111.txt"))) {

            String line;
            while ((line = ff.readLine()) != null) {
                String[] parts = line.split(",");
                for (String part : parts) {
                    c111.add(part.trim());
                }
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        Set<String> c311 = new TreeSet<>();

        try (BufferedReader rm = new BufferedReader(new FileReader("cse311.txt"))) {
            String ln;
            while ((ln = rm.readLine()) != null) {
                String[] parts = ln.split(",");
                for (String pt : parts) {
                    c311.add(pt.trim());
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Student of CSE311");
        int n = 0;
        for (String std : c311) {
            System.out.println(std + " ");
            n++;
        }
        System.out.println("Student of CSE311 :" + n);

        System.out.println("Student of CSE111: ");
        int m = 0;
        for (String std : c111) {
            System.out.println(std + " ");
            m++;
        }
        System.out.println("Number of student CSE111 :" + m);

    }
}