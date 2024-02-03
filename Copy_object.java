class Car{
    
    private String model;
    private String comp;
    private int year;

    Car(String comp,String model,int year){
        this.setcomp(comp);
        this.setmodel(model);
        this.setyear(year);
    }

    Car(Car x){
        this.copy(x);
    }

    public void setmodel(String model){
        this.model=model;
    } 
    
    public void setcomp(String comp){
        this.comp=comp;
    } 
    
    public void setyear(int year){
        this.year=year;
    } 
    
    public int getyear(){
        return year;
    } 
    public String getmodel(){
        return model;
    } 
    public String getcomp(){
        return comp;
    } 

    void copy(Car x){
        this.setcomp(x.getcomp());
        this.setmodel(x.getmodel());
        this.setyear(x.getyear());
    }

    void printing(){
        System.out.println(this.getcomp());
        System.out.println(this.getmodel());
        System.out.println(this.getyear());
    }
}

public class Copy_object {
    public static void main(String[] args) {
        
        Car car1=new Car("Ford","Mustand",2026);
        Car car2=new Car(car1);

        System.out.println(car1);
        System.out.println(car2);
        
        car1.printing();
        car2.printing();



    }
}
