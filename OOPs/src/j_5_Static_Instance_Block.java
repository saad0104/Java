



public class j_5_Static_Instance_Block {
 
    // Instance Block
    {     
        System.out.println("This is Instance Block");
    }

    static    // static Block
    {
        System.out.println("This is inside a static Block");
    }

    j_5_Static_Instance_Block()   //Constructor
    {
        System.out.println("This is inside a constructor");
    }
    public static void main(String[] args) {

        j_5_Static_Instance_Block j = new j_5_Static_Instance_Block();
        System.out.println("This is inside main method");

    }
}


// Static Block always execute first.
// Instance block got no name.

// static  -->  main -->> Instance -- >> Constructor  -->> Method