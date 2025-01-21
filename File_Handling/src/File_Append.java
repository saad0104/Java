import java.io.*;

public class File_Append {
    public static void main(String[] args) throws IOException {

        FileWriter f = new FileWriter("E:\\Java\\File_Handling\\hello.txt", true);
        String st = "hey";
        try {
            f.append("\n" + st);
            f.close();
            System.out.println("Appended");
        } catch (Exception e) {
            System.out.println("Exception Handeled");
        }

    }
}
