
class guddo {
    void show() {
        System.out.println("I am from Super class");
    }
}

class verygood extends guddo {
    @Override
    void show() {
        // super.show();
        System.out.println("I am from overriden subclass");
    }
}

public class j_12_Method_Overriding {
    public static void main(String[] args) {
        guddo g = new verygood();
        // verygood g = new verygood();
        g.show();
    }
}


// Constructor in the object has to be of subclass.
// method of sub and superclass has to be of same name and same parameters.
