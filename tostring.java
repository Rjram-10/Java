/*  toString = special method that all object inherit , that represent the obejct textually,
                impliclity (it gives the address of object which is declared ) and expliclity (it gives 
                what is given in method toString in class)

Method overriding = Declaring a method in sub class , which is alreday present in parent class
                    so that sub class can give it's own implementation over that method
                */
class Car{
    String comp="Ford";
    String model="Mustang";
    int year=1976;

    @Override // Common practise to show method overriding happening here

    public String toString() {
        return comp+"\n"+model+"\n"+year;
    }
}
public class tostring {
    public static void main(String[] args) {
        Car car=new Car();
        System.out.println(car);
    }
}
