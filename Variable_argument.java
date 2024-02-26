public class Variable_argument {

    
    // public static int sum(int ...arr) we can write in this format also and it indicates that it 
                                    //  doesn't need an argument to run the  methods , it would run without it also               
    public static int sum(int x,int ...arr){
 
        int result =x;
        
        for(int i:arr){
            result+=i;
        }
        
        return result;
    
    }
    
    public static void main(String[] args) {
    
    System.out.println(sum(1,2,3,4));
    System.out.println(sum(1));
    // System.out.println(sum()); //This would give an error as it was compulsory to put an argument

    }
    
}
