import java.util.Scanner;

public class practice_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of participants :- ");
        int num=sc.nextInt();
        String arr[]=new String[15];
        for (int i=0 ; i<num;i+=2) {
            System.out.print("Enter name :- ");
            arr[i]=sc.next();
            System.out.print("Enter age :- ");
            arr[i+1]=sc.next();
        }
        for(int i=0;i<num;i+=2){
            int j=Integer.parseInt(arr[i+1]);
            if(j>=18){
                System.out.println(arr[i]+" is eligible for vote");
            }
        }
  
}
}
