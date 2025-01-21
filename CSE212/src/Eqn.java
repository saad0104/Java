



class SecondClass
{
    void Claculation(double t,double x)
    {
        double valueM = Math.sqrt((6*t*t)/((Math.sqrt(t))+x));

        System.out.println("Value of M:" +valueM);
    }
    
}

class ThirdClass extends SecondClass
{
    
}


public class Eqn {
    public static void main(String[] args) {

        SecondClass objC = new SecondClass();
        objC.Claculation(0.5, 0.6);        
    }
    
}

// Inheritence

// Extend class

// Hieararchial Inheritence,Multilevel Inheritecnce,Single Inheritence

// Polymorphism

// Encapsulation

// tinyurl.com/oopCu