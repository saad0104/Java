// public class Error {
//     public static void main(String args[]) {
//         int a[] = { 7, 9, 45, 63, 10 };
//         int b=7;
//         try{
//             for(int i=0;i<7;i++)
//             {
//                 int x= a[i+9]/(b-7);
//                 System.out.println(x);
//             }
//         }
//         catch(ArithmeticException e)
//         {
//             System.out.println("Division by Zero");
//         }
//         catch(ArrayIndexOutOfBoundsException e)
//         {
//             System.out.println("Array index Error");
//         }
//         // throw new  ArithmeticException();

//     }
// }

// Managing Error and Exceptions
//    -->> Runtime  (Bug)
//    -->> Compiletime Error

// Runtime Error
//    -->> Cathch
//    -->> try
//    -->> Finally
//    -->> Throws Exceptions 
//    -->> Throw  hnadles only one exceptions

//   -->> Exception handling (important af)
//   -->>

//   ** Multithreading  **

//    -->> Run method
//    -->> Runnable interface
//    -->> Threading (google)
//    -->> This keyword

//    -->> Synchronized method.

// public synchronized void Method1 () {
//     // Appropriate method-related code.
//     }
//    // E.g. Synchronizing a block of code inside a function:
//     public myFunction (){
//     synchronized (this) {
//     // Synchronized code here.
//     }

class At extends Thread {
    public void run() {
        System.out.println("threadA started");
        for (int i = 1; i <= 4; i++) {
            System.out.println("\tFrom Thread A : i=" + i);
        }
        System.out.println("Exit from A");
    }
}

class Bt extends Thread {
    public void run() {
        System.out.println("threadB started");
        for (int j = 1; j <= 4; j++) {
            System.out.println("\tFrom Thread B : j=" + j);
        }
        System.out.println("Exit from B");
    }
}

class Ct extends Thread {
    public void run() {
        System.out.println("threadC started");
        for (int k = 1; k <= 4; k++) {
            System.out.println("\tFrom Thread C : k= " + k);
        }
        System.out.println("Exit from C");
    }
}

public class ThreadPriority {
    public static void main(String[] args) {
        At threadA = new At();
        Bt threadB = new Bt();
        Ct threadC = new Ct();
        threadC.setPriority(Thread.MAX_PRIORITY);
        threadB.setPriority(threadA.getPriority() + 1);
        threadA.setPriority(Thread.MIN_PRIORITY);
        System.out.println("Start Thread A");
        threadA.start();
        System.out.println("Start Thread B");
        threadB.start();
        System.out.println("Start Thread C");
        threadC.start();
        System.out.println("End of main Thread ");
    }
}