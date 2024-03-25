import java.util.Scanner;
public class reversing_String{
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the a String :- ");

        String s=sc.nextLine();

        char[] ch=s.toCharArray();
        String[] so=s.split("\\s");

        String n=""; 
        String j="";

        for(int i=ch.length-1;i>=0;i--){
            char c=Character.toUpperCase(ch[i]);
            n=c+n; // Uppercasing String

            j+=ch[i]; //Reversing String
        }

        String jk="";

        for(String si:so){
            String f=si.substring(0,1);
            String l=si.substring(1);
            jk=f.toUpperCase()+l+" "+jk;  // Capitalize first letter
        }

        System.out.println("Uppercase String - "+n); 
        
        System.out.println("Reversing String :- "+j.trim());

        System.out.println("First letter Captalize :- "+jk);
    }
}
