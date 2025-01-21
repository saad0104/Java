
class AA {
    int i, j;

    AA(int a, int b) {
        i = a;
        j = b;
    }

    void show() {
        System.out.println("i = " + i + ", j = " + j);
    }
}

class BB extends AA {
    int k;

    BB(int a, int b, int c) {
        super(a, b);
        k = c;
    }

    void show() {
        // super.show();
        System.out.println("k = " + k);
    }
}

public class OverRide {
    public static void main(String[] args) {
        BB nBB = new BB(1, 2, 3);
        nBB.show();

    }
}
