import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Age_hour {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str1=sc.nextLine();
        String str2=sc.nextLine();

        DateTimeFormatter obj=DateTimeFormatter.ofPattern("HH-mm");

        LocalTime date1=LocalTime.parse(str1,obj);
        LocalTime date2=LocalTime.parse(str2,obj);
        

        Period diff=Period.between(date1, date2);
        System.out.println(diff.getDays()+" "+diff.getMonths()+" "+diff.getYears());
        long diff1=Math.abs(diff.toTotalMonths());
        System.out.println(diff1);

    }
}
