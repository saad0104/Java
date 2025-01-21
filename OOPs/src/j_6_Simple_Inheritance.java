import java.util.Scanner;

// Simple Inheritence


class sup {                     // Super class
    String name;
    int Id;

    void input() {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter name : ");
        name = scan.nextLine();

        System.out.print("Enter Id : ");
        Id = scan.nextInt();

        scan.close();
    }
}

class sub extends sup {            // subclass
    void disp() {
        System.out.printf("Id of %s is %d", name, Id);
    }
}


public class j_6_Simple_Inheritance {
    public static void main(String[] args) {

        sub s = new sub();    // only the sub class's object has to be created.
        s.input();            // We can access the super class methods through the sub class object
        s.disp();

    }
}
