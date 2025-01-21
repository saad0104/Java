public class Suspend_Resume extends Thread {
    public void run() {
        String S = Thread.currentThread().getName();

        for (int i = 0; i < 5; i++) {
            System.out.println(S);
        }
    }

    @SuppressWarnings("removal")
    public static void main(String[] args) {
        Suspend_Resume sr1 = new Suspend_Resume();
        Suspend_Resume sr2 = new Suspend_Resume();
        Suspend_Resume sr3 = new Suspend_Resume();

        sr1.setName("Thread1");
        sr2.setName("Thread2");
        sr3.setName("Thread3");

        sr1.start();
        sr2.start();
        sr2.suspend();
        sr3.start();
        sr2.resume();
    }
}
