import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        System.out.println("Getting input from user :-");

        Scanner sc = new Scanner(System.in); // Class defining for taking inp uts and to take inputs 
                                              // we have to make object of it to take input from users
        
        System.out.println("Number 1:- ");
        int a = sc.nextInt();
        
        System.out.println("Number 2 :- ");
        boolean check = sc.hasNextFloat(); // To check whether entered is data value or not which with next
        float b = sc.nextFloat();
        
        System.out.println("Sum of numbers are " + (a + b));
        
        System.out.println("Is the number 2 is Float :- "+check);
        
        sc.nextLine();  // This extra nextLine is used to consume the line by the complier so that complier goes to
                        // next line for input . 
        String st = sc.nextLine();
        System.out.println(st);
        
    }

}
