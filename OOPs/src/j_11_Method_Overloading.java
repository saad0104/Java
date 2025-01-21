// Method OOverloading
// Compile Time Polymorphism


class Good{
    
    void add()
    {
        int a = 10;
        System.out.println(a);
    }
    void add(int a,int b)
    {
        System.out.println(a+b);
    }

    void add(int a,double b)
    {
        System.out.println(a+b);
    }

}

public class j_11_Method_Overloading {
    public static void main(String[] args) {
        Good G = new Good();
        G.add();
        G.add(10,15);
        G.add(15,20.2);
    }
}


// Same method acts differently according to the parameter change