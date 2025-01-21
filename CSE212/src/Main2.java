// Multilevel Inheritance


class one{
    public double under(int t,int x)
    {
        double und = Math.sqrt(t)+x;
        return und;
    }
}
class Two extends one
{
    public double upper(int t)
    {
        double up = (6*t*t);
        return up;
    }
}

class Three extends Two
{
    public double last (double m,double n)              //  THREE -> TWO -> ONE
    {
        double las = Math.sqrt(m / n);
        return las;
    }
}



public class Main2 {
    public static void main(String[] args) {
        Three EQ = new Three();
        double L = EQ.under(5,3);
        double U = EQ.upper(5);
        double F = EQ.last(U,L);
        System.out.println(F);

    }
    
}


//final class

//abstract class , method

// 