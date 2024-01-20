import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter No.of Subject :- ");
        int n=sc.nextInt();
        float total=0.0f;
        for(int i=0;i<n;i++){
        System.out.print("Enter Subject marks:- ");
        int a=sc.nextInt();
        total+=a;
        }
        System.out.println("Percentage of Student is :- "+(total/n));
        sc.close()
    }
}
