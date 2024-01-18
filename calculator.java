import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Subject marks:- ");
        int a=sc.nextInt();
        System.out.print("Enter Subject marks:- ");
        int b=sc.nextInt();
        System.out.print("Enter Subject marks:- ");
        int c=sc.nextInt();
        System.out.print("Enter Subject marks:- ");
        int d=sc.nextInt();
        System.out.print("Enter Subject marks:- ");
        int e=sc.nextInt();
        // float sum=a+b+c+d+e;
        System.out.println("Percentage of Student is :- "+(((float)(a+b+c+d+e)/500)*100));

    }
}
