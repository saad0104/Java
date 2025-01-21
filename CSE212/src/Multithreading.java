
class MT extends Thread{
    public void run()
    {
        for(int i=0;i<=5;i++)
        {
            System.out.println(i);


            // try {
            //     Thread.sleep(1000);
            // } catch (InterruptedException e) {
            //     // TODO Auto-generated catch block
            //     e.printStackTrace();
            // }
    
        }
      
    }
}
class MT2 extends Thread{
    public void run()
    {
        for(char c = 'a' ;c<'f' ;c++)
        {
            System.out.println(c);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}


class MT3 implements Runnable{
    public void run()
    {
        for(char x='w';x<='z';x++)
        {
            System.out.println(x);
        }
    }
}


public class Multithreading extends Thread{
    public static void main(String[] args)
    {
        // MT multi = new MT();
        // multi.start();
        // multi.run();
        new MT().start();

        MT2 multi2 = new MT2();
        multi2.start();
        // multi2.run();

        MT3 runnable = new MT3();
        // Thread threadMT3 = new Thread(runnable);
        // threadMT3.start();
        runnable.run();
    }
   
} 
