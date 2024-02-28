/*Polymorphism = it means many forms  */

class Vechile{
    public void go(){

    }
}
class Boat extends Vechile{
    public void go(){
        System.out.println("The Boat is in race");
    }
}
class Bicycle extends Vechile{
    public void go(){
        System.out.println("The Bicycle is in race");
    }
} 

class Car extends Vechile{
    public void go(){
        System.out.println("The Car is in race");
    }
}

public class Polymorphism {

    public static void main(String[] args) {
        Car car=new Car();
        Bicycle bicycle = new Bicycle();
        Boat boat=new Boat();

        Vechile[] racers={car,bicycle,boat};

        for (Vechile x : racers) {
            x.go();
        }
    }
    
}
