// Hierarchical Inheritance

class Supp {
    void FirstName() {
        System.out.print("Saad ");
    }
}

class Ext1 extends Supp         
{
    void SecondName() {
        System.out.print("Al");
    }
}

class Ext2 extends Supp {
    void LastName() {
        System.out.print("Mahmud");
    }
}

public class j_8_Hierarchical_Inheritance {
    public static void main(String[] args) {
        Ext1 E1 = new Ext1();
        Ext2 E2 = new Ext2();
        E1.FirstName();
        E1.SecondName();
        System.out.println();
        E2.FirstName();
        E2.LastName();

    }
}

// All subclasses extends one super class

// If one block of code is to use every time and with that suitable code blocks 
// is to use,than we can use Hierarchical Inheritence