// Multiple Inheritence using Interface
// We can do so by using interface and method overriding.

interface A {
    void show();
}

interface B {
    void Disp();
}

class MIn implements A, B {
    @Override
    public void show() {
        System.out.println("From Interface A");
    }

    @Override
    public void Disp() {
        System.out.println("From Interface B");
    }
}

public class j_17_MUltiple_Inheritence_using_Interface {
    public static void main(String[] args) {
        MIn objMIn = new MIn();
        objMIn.show();
        objMIn.Disp();
    }
}
