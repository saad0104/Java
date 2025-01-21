public class MainClass {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");


        String name = "Saad";
        String name2 = "Mahmud";


        // lambda lm = new lambda() {
        //     public void message()
        //     {
        //         System.out.println("Hello");
        //     }
        // };
        //   (arguments) -> { statements };


lambda lmm = (x) -> {
    System.out.println("Hello " + x);
    System.out.println("Have a nice Day!");
};
lmm.message(name);


lambda lmm2 = (y) -> {
    System.out.println("Hi "+ name2);
};

lmm2.message(name2);


// new lambda_ActionListener();


    }
}
