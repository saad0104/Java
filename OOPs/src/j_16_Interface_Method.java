// use of Interface method

interface Client {
    void Frontend();
    void Backend();
}

abstract class Omuk implements Client    // This class is abstract because 
{                                        // It didn't override one method from the implemented interface 
    @Override                                    
    public void Frontend() {
        System.out.println("Frontend Done");
    }
}

class Tomuk extends Omuk {
    @Override
    public void Backend() {
        System.out.println("Backend Done");
    }
}

public class j_16_Interface_Method {
    public static void main(String[] args) {
        Tomuk Tom = new Tomuk();
        Tom.Frontend();
        Tom.Backend();
    }
}
