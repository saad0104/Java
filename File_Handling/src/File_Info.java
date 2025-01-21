import java.io.File;

public class File_Info {
    public static void main(String[] args) {

        File f = new File("E:\\Java\\File_Handling\\hello.txt");

        if (f.exists()) {
            System.out.println("File name " + f.getName());
            System.out.println("File Loaction " + f.getAbsolutePath());
            System.out.println("File Writable " + f.canWrite());
            System.out.println("File Readable " + f.canRead());
            System.out.println("File SIze " + f.length());
            // System.out.println("File removed " + f.delete());
        } else {
            System.out.println("Not Exists");
        }
    }
}