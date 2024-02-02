/*Abstraction is a process of hiding the implementation details and showing only functionality
 to the user.
 Abstract class cannot be initiated , but they can subclass abstract methods are declared without
 an implementation 
 It adds security .
 
 */
abstract class  Vechile{
    abstract void go(); 

} 
class car extends Vechile{
    void go(){
        System.out.println("In the abstract class "); // abstract method's body can't be defined in same class
                                                     // but it had to defined in subclass 
    }
}
public class Abstract {
    public static void main(String[] args) {
        // Vechile vec=new Vechile() ;  This can't be initiated as it is abstract class
         car mers=new car();
         mers.go();

    }
}
