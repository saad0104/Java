
class Secondclass {
    void methodA(int a, int b) {
        int sum = a + b;
        System.out.println("Both integer :" +sum);
    }

    void methodA(int a, double b) {
        double sum = a + b;
        System.out.println("Int and Double:" +sum);
    }

    void methodA(double a, double b) {
        double sum = a + b;
        System.out.println("Both double: " +sum);
    }
}

public class FirstClass {

    public static void main(String[] args) {

        Secondclass objA = new Secondclass();
        objA.methodA(2.0, 3.0);

        System.out.println("Hello");

    }
}