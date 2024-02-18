class Food{
    String food;

    Food(String food){
        this.food=food;
    }
}

public class array {
    public static void main(String[] args) {
         
        Food[] Fridge=new Food[3]; //Declaration of array of datatype of Food[]
        
        Food food1=new Food("Pizza"); 
        Food food2=new Food("Buuter chicken");
        Food food3=new Food("Burger");

        Fridge[0]=food1;
        Fridge[1]=food2;
        Fridge[2]=food3;

        System.out.println(Fridge[0]); // Return memory of class on which it saved the food1 = "Food@6ff3c5b5"
        System.out.println(Fridge[0].food); //Returns the value at '0' index




    }
}
