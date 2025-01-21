import java.util.Scanner;

class min implements Runnable {
    int[] arr;
    int start, end;
    int res = Integer.MAX_VALUE;

    min(int[] arr, int start, int end) {
        this.arr = arr;
        this.start = start;
        this.end = end;
    }

    @Override
    public void run() {

        for (int i = start; i < end; i++) {
            res = Math.min(arr[i], res);
        }

        // throw new UnsupportedOperationException("Unimplemented method 'run'");
    }

    public int re() {
        return res;
    }

}

public class _3_ThreadMinimum {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int[] arr = new int[500];

        for (int i = 0; i < 500; i++) {
            arr[i] = scan.nextInt();
        }
        scan.close();    

        Thread[] thrd = new Thread[5];
        min[] task = new min[5];

        for (int i = 0; i < 5; i++) {
            int start = i * 100;
            int end = (i + 1) * 100;
            task[i] = new min(arr, start, end);
            thrd[i] = new Thread(task[i]);
            thrd[i].start();
        }

        for (int i = 0; i < 5; i++) {
            try {
                thrd[i].join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        int mn = Integer.MAX_VALUE;

        for (int i = 0; i < 5; i++) {
            mn = Math.min(mn, (task[i].re()));
        }

        System.out.println("Minimum Number is: " + mn);
    }
}
