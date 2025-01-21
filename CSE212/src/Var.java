class A
{
    static int x = 10;     // Static Variable
    int z= 30;             // Instance variable

    public int MethA(int g)
    {
        int k=g;   // Local Variable
       // System.out.println(k);
        return k;
    }
}

public class Var {

    public static void main(String[] args )
    {
        A M = new A();
       System.out.println(A.x);
       System.out.println(M.z);
       System.out.println(M.MethA(5));


    }
    
}
