import java.util.Scanner;

class Cons {
    int Id = 23;
    String Name = "Saad";         // Instance Variable   
    double Cg = 2.5;               // Can Assign value in instance variable  (Priority last)

    Cons() {

        // this.Id = 45;
        // this.Name = "Saad";      // Can assign value inside constructor method  (Priority 2nd)
        // this.Cg = 2.5;
    }

    void Show() { // Method of the class
        System.out.println(Id + " " + Name + " " + Cg);
    }

}

public class j_2_Intro_Constructor {
    public static void main(String[] args) {
        // Scanner scan = new Scanner(System.in);
        Cons ObjofCons = new Cons();

        // ObjofCons.Id = scan.nextInt();
        // ObjofCons.Name = scan.next();            // can assign value inside main method also (Priority top)
        // ObjofCons.Cg = scan.nextDouble();

        ObjofCons.Show();

    }
}
