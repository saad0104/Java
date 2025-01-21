public class Generic_Method {
    Integer[] intArray = { 1, 2, 3, 4, 5 };
    Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4, 5.5 };
    String[] stringArray = { "Hello", "Hi", "Bye", "bye", "ok" };

    public static <Thing> void displayArray(Thing[] xx) {

        for (Thing x : xx) {
            System.out.println(x + " ");
        }
        System.out.println();
    }

}
