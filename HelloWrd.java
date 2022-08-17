
import java.time.LocalDate;

public class HelloWrd {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        int today = date.getDayOfMonth();
        LocalDate firstDayOfMonth = date.minusDays(today-1);
        int firstDayOfWeekValue= firstDayOfMonth.getDayOfWeek().getValue();
        System.out.println("Mon Tue Wed Thu Fri Sat Sun");
        for(int i=1;i<firstDayOfWeekValue;++i){
            System.out.print("    ");
        }
        int lastDayOfMonthValue = firstDayOfMonth.plusMonths(1).minusDays(1).getDayOfMonth();
        int k = firstDayOfWeekValue;
        for(int j=1;j<=lastDayOfMonthValue;++j,++k){
            System.out.printf("%3d",j);
            if(j==today)
                System.out.print("*");
            else
                System.out.print(" ");
            if(k%7==0)
                System.out.println();
        }
    }
}
