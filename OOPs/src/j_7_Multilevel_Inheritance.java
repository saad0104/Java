import java.util.Scanner;

// Multilevel Inheritence

class SupCls {              // Super class
    int a;
    int b;
    int s;

    void input() {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter A : ");
        a = scan.nextInt();

        System.out.print("Enter B : ");
        b = scan.nextInt();

        scan.close();
    }
}

class sub1 extends SupCls {         // subclass 1
    int sum() {
        s = a + b;
        return s;
    }
}

class sub2 extends sub1 {       // subclass 2
    void disp() {
        System.out.printf("The Sum of A and B is %d", s);
    }
}

public class j_7_Multilevel_Inheritance {
    public static void main(String[] args) {

        sub2 s = new sub2();      // only the last sub class's object has to be created.
        s.input();                // We can access the super class methods and the previous subclass's method through the last sub class object
        s.sum();
        s.disp();

    }
}
