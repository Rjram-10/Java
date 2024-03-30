import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.text.*;
import java.text.ParseException;

public class Age_in_date {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str1=sc.nextLine();
        String str2=sc.nextLine();

        DateTimeFormatter obj=DateTimeFormatter.ofPattern("dd-MM-yyyy");

        LocalDate date1=LocalDate.parse(str1,obj);
        LocalDate date2=LocalDate.parse(str2,obj);

        Period diff=Period.between(date1, date2);
        System.out.println(diff.getDays()+" "+diff.getMonths()+" "+diff.getYears());
        long diff1=Math.abs(diff.toTotalMonths());
        System.out.println(diff1);
    }
}
