import java.io.File;

public class File_Rename {

    public static void main(String[] args) {

        File f = new File("File_Handling\\hello.txt");
        File fnew = new File("File_Handling\\hi.txt");

        if (f.exists()) {

            System.out.println(f.renameTo(fnew));
        } else {
            System.out.println("h");
        }
    }
}
