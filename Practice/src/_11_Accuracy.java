import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class _11_Accuracy {
    public static void main(String[] args) throws FileNotFoundException {

        List<String> l1 = new ArrayList();
        List<String> l2 = new ArrayList();

        FileReader fr = new FileReader("src\\prediction.txt");
        try {
            BufferedReader bf = new BufferedReader(fr);
            String line;

            while ((line = bf.readLine()) != null) {
                String[] parts = line.split("\t");

                String[] st = parts[1].split(" ");
                l1.add(st[0].trim());
                l2.add(st[1].trim());
            }
            int ff = 0, fp = 0, pf = 0, pp = 0;

            for (int i = 0; i < 10; i++) {
                if (l1.get(i) == "Favor" && l2.get(i) == "Favor") {
                    ff++;
                }
                if (l1.get(i) == "Favor" && l2.get(i) == "Against") {
                    fp++;
                }
                if (l1.get(i) == "Against" && l2.get(i) == "Favor") {
                    pf++;
                }
                if (l1.get(i) == "Against" && l2.get(i) == "Against") {
                    pp++;
                }

                double r = (double) (ff) / (ff + pf);
                double p = (double) ff / (ff + fp);
                double f1 = (double) (2 * p * r) / (p + r);
                double acc = (double) (ff + pp) / (ff + fp + pf + pp);
                System.out.println("Accuracy : " + acc);

            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
