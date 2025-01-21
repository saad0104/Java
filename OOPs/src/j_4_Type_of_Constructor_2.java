// 3. Copy Constructor
//  4. private Constructor

class cp {
    int Id;
    String Name;

    cp() {
        Id = 45;
        Name = "Saad";
        System.out.println(Id + " " + Name);
    }
    cp(cp ref)
    {
        Id = ref.Id;
        Name = ref.Name;
        System.out.println(Id + " " + Name);      // This Constructor copies variables from the
                                                  // previous cp constructor
    }




// // 4. Private Constructor

//     private  cp()
//     {
//         Id = 2345;
//         Name = "Goru";
//         System.out.println(Id + " " + Name);      // Element of Private Method can't be accessed from outside
                                                    // that class.so main method should be inside that class.
//     }
//     public static void main(String[] args) {
//         cp objprip = new cp();
//     }
}

public class j_4_Type_of_Constructor_2 {
    public static void main(String[] args) {
        cp objcp = new cp();
        cp objcpp = new cp();

    }

}
