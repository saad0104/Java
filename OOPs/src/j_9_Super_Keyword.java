
class Suup {
    int Id = 45;

    Suup()
    {
        System.out.println("Constructor of the SuperClass");
    }
    void show() {
        System.out.println("From the Super Class");
    }

}

class Suuup extends Suup {
    int Id = 420;

    Suuup()
    {
        System.out.println("Constructor of the SubClass");
    }
    void show() {
        super.show(); // This is the method from Super Class

        System.out.println(Id); // This is the variable of Suuup class
        System.out.println(super.Id); // This is the variable of class Suup
    }
}

public class j_9_Super_Keyword {
    public static void main(String[] args) {
        Suuup su = new Suuup();
        su.show();

    }
}



//  In case of Constructor, When we create object for the subclass, the method
//  super();  is automatically called and the codeblocks of the constructor from 
//  superclass executes before the subclass constructor.


