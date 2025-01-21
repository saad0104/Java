import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class File_Copy {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("E:\\Java\\File_Handling\\hello.txt");
        File f = new File("E:\\Java\\File_Handling\\bye.txt");
        f.createNewFile();
        FileWriter fw = new FileWriter("E:\\\\Java\\\\File_Handling\\\\bye.txt");

        int I;

        while((I = fr.read()) != -1)
        {
            fw.write((char)I);
        }
        fw.close();
        fr.close(); 
        
    }
}
