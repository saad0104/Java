import java.io.*;

public class File_Read {
    public static void main(String[] args) throws IOException {

        // read
        // FileReader fr = new FileReader("E:\\Java\\File_Handling\\hello.txt");
        // int C;
        // while ((C = fr.read()) != -1) {
        // System.out.println((char) C);
        // }
        // fr.close();

        FileReader fr = new FileReader("File_Handling\\hello.txt");
        // int st;
        // while ((st = fr.read()) != -1) {
        // System.out.println((char)st);

        // }

        BufferedReader bf = new BufferedReader(fr);

        String st;
        while ((st = bf.readLine()) != null) {
            
            String ss[] =  st.split(" ");
            
            System.out.println(ss[0]);

        }

    }
}
