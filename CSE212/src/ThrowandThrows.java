
class Thrs extends Exception{
    public Thrs(String str){
        super(str);
    }

}



public class ThrowandThrows {
    public static void main(String[] args)  // throws Thrs
    {
        try{
        double c = divide(2,3);
        System.out.println(c);
        if(c<2)
        {
             throw new Thrs("Sad");
        }
        }
        catch(Exception e) {
            System.out.println(e.getMessage());    // Exception class 'shows' generates this message automatically if we don't give it anything to show.
        }
    }

    static double divide(int a,int b)  throws Thrs
        {
            double result = a/b;
            return result;
        }
    
}
