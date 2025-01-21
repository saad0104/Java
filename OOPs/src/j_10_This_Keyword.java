// this keyword

class Add {
    int A, B;

    int A(int A, int B) {
        this.A = A;         // this.A    is the instance variable(class's own)
                            // A is the local variable (method's own)
        this.B = B;
        int res = A + B;
        return res;
    }
}

public class j_10_This_Keyword {
    public static void main(String[] args) {
        Add Add = new Add();
        System.out.println("Sum : " + Add.A(60, 9));
    }
}