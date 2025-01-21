public class Thread_Schedular extends Thread{
    public void run()
    {
        String S = Thread.currentThread().getName();
        for(int i=0;i<5;i++)
        {
            System.out.println(S);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread_Schedular t1 = new Thread_Schedular();
        Thread_Schedular t2 = new Thread_Schedular();
        Thread_Schedular t3 = new Thread_Schedular();

        t1.setName("Thread1");
        t2.setName("Thread2");
        t3.setName("Thread3");

        t1.start();
        t2.start();
        // t2.join();
        t3.start();



        // for(int i=0;i<5;i++)
        // {
        //     System.out.println(i + " from main");
        // }
    }
    
}
