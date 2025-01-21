class count {
    private int c = 0;

    synchronized void cnt() {
        c++;
    }

    int get() {
        return c;
    }

}

class th extends Thread {
    public void run() {

    }
}

public class Synchronization {
    public static void main(String[] args) {

        count cnt = new count();

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                cnt.cnt();
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                cnt.cnt();
            }

        });

        t1.start();
        t2.start();

        try {
        t1.join();
        t2.join();
        } catch (Exception e) {
        System.out.println(e.getMessage());
        }

        System.out.println(cnt.get());

    }
}
