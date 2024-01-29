import java.util.Scanner;
class Employee{
    int Salary;
    String name;
    
    public void getsalary(){
        System.out.println("Salary is :- "+Salary);
    }
    
    public void getname(){
        System.out.println("Name is :- "+ name);
    }

    public void setname(String n){
        name=n;
        System.out.println("New name is :- "+name);
    }}
public class classes {

        

    
    public static void main(String[] args) {
        Employee first=new Employee();

        first.Salary=2500;
        first.name="Rajesh";
        
        first.getname();
        first.setname("Ramesh");
        
        first.getsalary();
        
        System.out.println(first.getClass());  //this method gives you information about the type of
                                              // an object during the execution of program.
            



    }
}
