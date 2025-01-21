class Y1 extends Thread {
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println("Thread1");
            Thread.yield();
        }
    }
}

class Y2 extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Thread2");
        }
    }
}

public class Yeild_Stop_isalive {
    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        Y1 y1 = new Y1();
        Y2 y2 = new Y2();

        y1.start();
        y1.stop();
        y2.start();
       System.out.println(y1.isAlive());
        

    }
}