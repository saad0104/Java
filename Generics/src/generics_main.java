public class generics_main {
    public static void main(String[] args) {

        // Generic_Class<Integer> genInt = new Generic_Class<Integer>(12);
        // System.out.println(genInt.getThing());

        // Generic_Method genmeth = new Generic_Method();
        // genmeth.displayArray(genmeth.doubleArray);

        GEneric_Constructor gcon = new GEneric_Constructor(12);
        gcon.show();
    }
}
