// covarient return type


class Aoo{
    Aoo show()
    {
        System.out.println("A");
        return new Aoo();
    }
}

class Boo extends Aoo{
    @Override
    Boo show()
    {
        super.show();
        System.out.println("B");
        return this;
    }
}

public class j_19_Covarient_Return_Type {
    public static void main(String[] args) {
        Boo bs = new Boo();
        bs.show();
    }
}

// Return type diffres in overriden method. 
