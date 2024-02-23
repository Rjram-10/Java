// It is used to achieve abstraction and multiple inheritance in Java.
// Interface fields are public, static and final by default, and the methods are public and abstract

interface Prey {

    default void info(){     // Default method , it's bodu can be defined here
        System.out.println("It's a prey ");  
    }
    static void Printting(String s){      //Static method , it's body can be defined here 
        System.out.println("This animal is "+s);
    } 
    void Prints(String s);  // Abstract method , it will be defined in class/interface in which it is implements/extend resp.
}

interface Predator{
    
    default void Print(){
        System.out.println("It's a predator");
    }
    static void Printting(String s){
        System.out.println("This animal is "+s);
    }

    void Prints(String s);
}

class Rabbit implements Prey{

    @Override
    public void Prints(String s) {
        System.out.println("This is in class "+s);
    }
}

class Eagle implements Predator{

    @Override
    public void Prints(String s) {
        System.out.println("This is in class "+s);
    }
}

class Fish implements Prey,Predator{

    @Override
    public void Prints(String s) {
        System.out.println("This is in class "+s);
    }
}



public class Interface{
    public static void main(String[] args) {
        
        Rabbit rabbit=new Rabbit();
        rabbit.info();
        rabbit.Prints("rabbit");
        Prey.Printting("Rabbit");
        
        System.out.println();

        Eagle eagle=new Eagle();
        eagle.Print();   // Dafult method can be called by obejct of class
        eagle.Prints("eagle"); // Abstract method ca be called by object of class
        Predator.Printting("Eagle"); //But Static method had to be class with interface

        System.out.println();

        Fish fish=new Fish();
        fish.Print();
        fish.info();
        fish.Prints("Prey and Predator");
        Predator.Printting("Predator");
        Prey.Printting("Prey");
        
        
    }
}
