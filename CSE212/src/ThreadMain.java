
class NThread implements Runnable {
    String name;
    Thread t;

    NThread(String threadname) {
        name = threadname;
        t = new Thread(this, name);
        t.start();
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(name + ": " + i);
        }
        System.out.println("End of thread " + name);
    }
}

public class ThreadMain {
    public static void main(String[] args) {
        new NThread("A");
    }
}
