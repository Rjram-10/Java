class Employee{
     
    private int id;
    private int Salary;
    private String Name;

    public Employee(){ // Contructors without any argument
        
        id=1;
        Salary=4500;
        Name="Rajesh";
    
    }
    
    public Employee(int ids){ // Contructors with one of the argument
        
        id=ids;
        Salary=4500;
        Name="Rajesh";
    
    }

    public Employee(int ids,int salary,String names){ //Constructor with all of argument

        id=ids;
        Salary=salary;
        Name=names;

    }

    public void getinfo(){
        System.out.println("Name is "+ Name +" with ID of "+ id+" of salary "+Salary);        
    }

}

public class constructors {
    public static void main(String[] args){
        
        Employee first = new Employee();
        Employee second = new Employee(2);
        Employee third = new Employee(3,25000,"Ramesh");

        first.getinfo();
        second.getinfo();
        third.getinfo();




    }

    }
    



    