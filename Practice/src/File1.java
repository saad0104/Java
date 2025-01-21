import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class File1 {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        try (BufferedReader fr = new BufferedReader(new FileReader("Practice\\input.txt"))) {
            String str;
            int sum = 0;
            while ((str = fr.readLine()) != null) {

                String[] parts = str.split(",");

                for (String st : parts) {
                    int n = Integer.parseInt(st);
                    sum += n;

                }
                System.out.println(sum);
                sum = 0;
            }

        } catch (IOException e) {
            e.getMessage();
        }

    }
}
