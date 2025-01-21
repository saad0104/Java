public class Multithreading_ThreadClass extends Thread {

    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("From Thread MT");
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public static void main(String[] args) throws Exception {

        Multithreading_ThreadClass th = new Multithreading_ThreadClass();
        th.start();

        for(int i=0;i<6;i++)
        {
            System.out.println("From Thread Main");
            Thread.sleep(1000);
        }

    }
}
