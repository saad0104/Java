import java.io.*;

public class WordCount {
    public static void main(String[] args) {
        File inFile = new File("E:\\Java\\Class_Works\\src\\output.dat");
        BufferedReader ins = null;
        try {
            ins = new BufferedReader(new FileReader(inFile));
            String intr = "";
            String filedata = "";
            while ((intr = ins.readLine()) != null) {
                filedata += intr + " ";
            }
            String delims = " ";
            String[] token = filedata.split(delims);
            System.out.print("Word No.: " + token.length + "\n");
        } catch (IOException e) {
            System.out.println(e);
            System.exit(-1);
        } finally {
            try {
                ins.close();
            } catch (IOException e) {
                System.out.println(e);
            }
        }
    }
}