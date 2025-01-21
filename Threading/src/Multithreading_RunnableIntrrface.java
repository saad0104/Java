public class Multithreading_RunnableIntrrface implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Numbers Thread-" + i);
        }
    }

    public static void main(String[] args) {
        Multithreading_RunnableIntrrface ri = new Multithreading_RunnableIntrrface();
        Thread t1 = new Thread(ri);
        t1.start();

        for (int i = 0; i < 5; i++) {
            System.out.println("Main Thread-" + i);
        }
    }

}
