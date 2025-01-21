// Encapsulation



class Enco{
    private int val;
    public void setValue(int A)
    {
        val = A;
    }

    public int getValue()
    {
        return val;
    } 
}


public class j_13_Encapsulation {
    public static void main(String[] args) {
        Enco e = new Enco();
        e.setValue(25);
        System.out.println(e.getValue());
    }
}


// For encapsulation, variable has to be private but method has to be public.
// To access the variables, we have to use methods.