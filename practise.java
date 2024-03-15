import java.util.Scanner;
public class practise {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter no. of subject :- ");
        int num=sc.nextInt();
        int arr[]=new int[num];
        
        int failed=0;
        int total=0;
        int totalnum=0;
        
        System.out.print("Is maximum marks of each subject is same or different . Y/N :- "); 
        char c=sc.next().charAt(0); // We can't do typecasiting here as String is an Object and
                                    // char is a data types .
        
        for(int i=0;i<num;i++){
            if(c=='N'){
                System.out.print("Enter maximum marks for Subject "+(i+1));
                int j=sc.nextInt();
                totalnum+=j;}
        
            System.out.print("Enter marks of Subject "+(i+1)+" ");
            arr[i]=sc.nextInt();
            
            if(arr[i]<33){
                failed+=1;
            }
            
            total+=arr[i];
        }
        
        if(failed>0){
            System.out.println("Failed in class");
        }
        
        else{
            
            if(c=='Y'){
            System.out.println("Student is passed in all subject with "+((float)total/num));}
            
            else{
                System.out.println("Student passed subject with percentage of "+(((float)total/(float)totalnum)*100));
            }
        }
    }
}
