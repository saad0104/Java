
interface CliA{
    void task1();
    default void task3()    // Default Method
    {
        System.out.println("Default method from Interface");
    }
    public static void task4()    // Static Method
    {
        // System.out.println("Static Method from Interface.Can not Override.");
        task5();
    }
    private static void task5()     // Private Method
    {
        System.out.println("Private Method");
    }
}
interface CliB extends CliA{
    void task2();
}
class Fin{
    public void task1()
    {
        System.out.println(10);
    }
    public void task2()
    {
        System.out.println(20);
    }
    void task3()
    {
        System.out.println("Default Method Overriden");
    }
}

public class j_18_Interface_Extending {
    public static void main(String[] args) {
        Fin Fn = new Fin();
        Fn.task1();
        Fn.task2();
        Fn.task3();
        CliA.task4();
    }
}


// In jdk 1.8 , Default or static methods can be inside interface along with absr=tract method.
// Default method may or may not be overriden.
// Static method doesn't need object to call.
// Static method can not be overriden.
// Private method should be used inside class.