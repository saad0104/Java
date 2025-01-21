public class ThreadPriority extends Thread{
    public void run()
    {
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getPriority());
    }
    public static void main(String[] args) {
        ThreadPriority p1 = new ThreadPriority();
        ThreadPriority p2 = new ThreadPriority();
        ThreadPriority p3 = new ThreadPriority();

        p1.setName("Thread 1");
        p2.setName("Thread 2");
        p3.setName("Thread 3");

        p1.setPriority(10);
        p2.setPriority(8);
        p3.setPriority(2);

        p1.start();
        p2.start();
        p3.start();
    }

}