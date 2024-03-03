/* static = a single copy of method/variable is created and shared among the objects the class
            throughout all obejcts the variable/method have same value and it could accessed without
            using object
   */
class Friend{ 
    String name;
    static int numoffriend;

    Friend(String name){
        this.name=name;
        numoffriend++;
    }
 
    static void Display(){
        System.out.println("The number of friends is "+numoffriend);
    }
}

public class Static {
    public static void main(String[] args) {
        
        Friend friend1=new Friend("Batman");
        Friend friend2=new Friend("Superman");
        Friend friend3=new Friend("Flash");

        Friend.Display(); // It counts the no. of friends object made through class Friend through 
                            // static variable numoffriend and static method Display()
    }
}
