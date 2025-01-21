class sample1
{
    void methodA()
    {
        System.out.println("MethodA-s1");
    }
}
class sample2 extends sample1
{
    void methodB()
    {
        System.out.println("methodA-s2");
        System.out.println("methodB");
    }
}


public class Miscellaneous {

    public static void main(String[] args)
    {
        sample1 objs = new sample2();
        
        objs.methodA();
    }
    
}


// Constructor  same name of method and class
//Parameterize constructor