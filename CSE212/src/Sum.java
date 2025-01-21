class Thread1 extends Thread {
    public int sum1 = 0;

    public void run() {
        for (int i = 1; i <= 2000; i++) {
            sum1 += i;
        }
    }
}

class Thread2 extends Thread {
    public int sum2 = 0;

    public void run() {
        for (int i = 2001; i <= 4000; i++) {
            sum2 += i;
        }
    }
}

class Thread3 extends Thread {
    public int sum3 = 0;

    public void run() {
        for (int i = 4001; i <= 6000; i++) {
            sum3 += i;
        }
    }
}

class Thread4 extends Thread {
    public int sum4 = 0;

    public void run() {
        for (int i = 6001; i <= 8000; i++) {
            sum4 += i;
        }
    }
}

class Thread5 extends Thread {
    public int sum5 = 0;

    public void run() {
        for (int i = 8001; i <= 10000; i++) {
            sum5 += i;
        }
    }
}

public class Sum {
    public static void main(String[] args) {
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();
        Thread3 t3 = new Thread3();
        Thread4 t4 = new Thread4();
        Thread5 t5 = new Thread5();

        // Start all threads
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

        // Wait for all threads to finish
        try {
            t1.join();
            t2.join();
            t3.join();
            t4.join();
            t5.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Calculate the final sum
        int finalSum = t1.sum1 + t2.sum2 + t3.sum3 + t4.sum4 + t5.sum5;

        // Print the final sum
        System.out.println("Total Sum = " + finalSum);
    }
}
