// Var Args Method


class Addition {
    void add(int... a) {
        int sum = 0;
        for(int x:a)
        {
            sum += x;
        }
        System.out.println(sum);
    }
}

public class j_20_Var_Arg_Method {
    public static void main(String[] args) {
        Addition objAD = new Addition();
        objAD.add(10);
        objAD.add(10, 20);
        objAD.add(10, 40, 50);

    }
}


// add(int ... a)   -->> Here ... a is an array type parameter.

// Video 37 