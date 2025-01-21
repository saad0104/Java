
interface User {
    void input();    // PUblic + Abstract

    void output();   // PUblic + Abstract

    // int a = 6;    // Public + Static + Final
}

class Inp implements User {
    String Name;
    int Id;

    public void input() {       // Method has to be public
        Name = "Saad";
        Id = 45;
    }

    public void output() {
        System.out.println(Id + " " + Name);
    }

}

public class j_15_Interface {
    public static void main(String[] args) {
        Inp I = new Inp();
        I.input();
        I.output();
    }
}


// Instance variable of an interface class is Public + Static + Final.
// As the variable is final,we can't change the value outside interface class.
// As the variable is Static, we can access it without object ceation.