import java.io.*;
import java.util.*;

public class File_Write {
    public static void main(String[] args) throws IOException {

        FileWriter f = new FileWriter("E:\\Java\\File_Handling\\hello.txt");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = sc.nextLine();
        sc.close();
        try {
            f.write(name);
        } catch (Exception e) {
            System.out.println("Exception Arised");
            System.out.println(e.getMessage());
        } finally {
            f.close();
        }

    }
}
// Overrides the content of the file