import java.util.Scanner;
import java.util.*;
import java.time.*;
import java.text.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
public class Age_day {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str1=sc.nextLine();
        String str2=sc.nextLine();

        DateFormat obj=new SimpleDateFormat("dd-MM-yyyy");

        try{
            Date d1=obj.parse(str1);
            Date d2=obj.parse(str2);

            long diff=Math.abs(d2.getTime()-d1.getTime());
            System.out.println(diff/(1000*60*60*24));


    }catch(ParseException e){
        System.out.println("Error hahaha");
    }
}
}
