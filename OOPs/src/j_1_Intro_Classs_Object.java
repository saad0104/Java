import java.util.Scanner;

class Intro {
    int Id;
    String Name;      // Data of the class
    double Cg;

    void Show() {     // Method of the class
        System.out.println(Id + " " + Name + " " + Cg);
    }
}

public class j_1_Intro_Classs_Object {
    public static void main(String[] args) {
        Intro ObjofIntro = new Intro();          // Object for the class
        Scanner scan = new Scanner(System.in);
        // ObjIntro.Id = 237010;
        // ObjIntro.Name = "Saad";
        // ObjIntro.Cg = 0.0;

        System.out.println("Enter Id(int):");
        ObjofIntro.Id = scan.nextInt();
        System.out.println("Enter Name(String):");           // Taking input and assigning into the class data variables.
        ObjofIntro.Name = scan.next();
        System.out.println("Enter CG(double):");
        ObjofIntro.Cg = scan.nextDouble();

        ObjofIntro.Show();        // Calling the class method

    }
}
