class Parent{
    public int x;
    Parent(){
        System.out.println("In the default constructor");
    }

    Parent(int x){
        this.x=x;
        System.out.println("This is in parent class " +x);
    }
    public String Printing(){
        return "This is method in parent class "+x;
    }

}
class child extends Parent{
    
    public int y;
    private String s;
    
    child(String s,int x){
        
        super(x); // By using the super keyword we access the methods , constructors of parent class
                    // in child class , it is reference to parent class
        this.s=s;
        System.out.println("In the derived class "+s);
    }
    public String writing(){
        return super.Printing();

    }
}
public class construc_inheritence {
    public static void main(String[] args) {
        // Parent q=new Parent();
        // Parent p=new Parent(25);

        final float c=56.45; //This final is sets the value of variable that can't be changed throughout the whole program
        
        child c=new child("Ram",25);
        
        System.out.println(c.writing());

    }
}
