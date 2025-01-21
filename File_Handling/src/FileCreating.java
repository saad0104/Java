import java.io.File;
import java.io.IOException;

public class FileCreating {
    public static void main(String[] args) {
        File f = new File("E:\\Java\\File_Handling\\hello.txt");
        try {
            if(f.createNewFile())
            {
                System.out.println("File Created");
            }
            else{
                System.out.println("File Exists");
            }
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
