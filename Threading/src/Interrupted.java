public class Interrupted extends Thread {
    public void run() {
        try{
            for(int i=0;i<5;i++)
            {
                System.out.println("Thread 1");
                Thread.sleep(1000);
            }
        }
        catch(InterruptedException e)
        {
            System.out.println(e.getMessage());
        }
    }
    public static void main(String[] args) {
        Interrupted ip = new Interrupted();
        ip.start();
        ip.interrupt();
    }
}