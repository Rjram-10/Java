import java.util.Scanner;
public class switch_function{
public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        switch(s){
            case "Shubham" :
                System.out.println("You are selected in company");
                break;
            //case "Aman" -> System.out.println("Being patience is key to success"); it's a way of
            // writing switch case in intense switch mode supported only above Java 14
            case "Param":
                System.out.println("Part of team");
            default:
                System.out.println("Whatever you are part of ");


        }
}}