// Abstract Class and Method



abstract class Animal{
    public abstract void sound();
    
}

class Dog extends Animal{
    Dog(){
        System.out.println("Hi from Dog...");
    }
    @Override
   public void sound()
    {
        System.out.println("Ghew Ghew");
    }
}
class Cat extends Animal
{
    Cat()
    {
        System.out.println("Hi from Cat...");
    }
    @Override
    public void sound()
    {
        System.out.println("Meow Meow");
    }
}

public class j_14_Abstraction {
    public static void main(String[] args) {
        // Dog D = new Dog();
        Animal D = new Dog();
        Cat C = new Cat();
        D.sound();
        C.sound();
    }
}

// Abstract method is overriden. 
// Object for Abstract class can't be created.
// Abstrct method should be inside Abstract class.
// Abstarct class has no body.
// public abstract void sound(); 
// Abstrct methods has to be overriden. Otherwise subclass will be Abstarct Class.