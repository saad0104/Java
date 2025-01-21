// 1. Default Constructor
// 2. Perameterized Constructor



// class Def {
//     Def() {
//         System.out.println("Hello World");    // Default Constructor  (No perameter passed)
//     }
// }



class pera{
    pera(String Name,int Age)
    {
        System.out.println(Name+" "+Age);     // Perameterized Constructor  (Perameter Passed)
    }
    pera(int Id, double Cg)
    {
        System.out.println(Id + " " + Cg);     // Multiple constructor with the same name is possible
    }   
                                        // but number of perameter or name of perameter should be different
}



public class j_3_Type_of_Constructor_1 {

    public static void main(String[] args) {
       
        // Def d = new Def();


        pera p = new pera("Saad",21);     // There can be Multiple Constructor with the same name
                                                   // but object for constructors should be different
        pera pp = new pera(45,2.5);


    }
}


// Multiple constructor inside same instance class is called Constructor overloading.
// Perameter for the constructor should be different