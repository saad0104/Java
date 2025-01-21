public class GEneric_Constructor {
    String big;

    <Thing> GEneric_Constructor(Thing tts) {
        big = tts.toString();
    }

    void show() {
        System.out.println(big);
    }
}
