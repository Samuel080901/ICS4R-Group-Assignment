
/**
 * test out date functionality
 *
 * @author (Jenny Bi)
 * @version (May 13, 2026)
 */
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DateClassJenny
{
    public static void main(String args[])
    {
        LocalDate currentDate = LocalDate.now();
        //J Output: 2026-05-13
        
        LocalDate nextWeek = currentDate.plusDays(7);
        //J Output: 2026-05-20  (13+7 = 20)

        LocalDate lastMonth = currentDate.minusMonths(1);
        //J Output: 2026-04-13
        
        LocalDate specificDate = LocalDate.of(2022, 12, 25);
        //J Output: 2022-12-25
        
        //J below is code to randomize a date
        //J Math.random() returns random double [0.0 and 1.0)
        int n = (int)(Math.random()*1000);
        System.out.println(n);
        System.out.println(currentDate.plusDays(n));
        
        
        //J test substracting 2 different dates to find out how many dates passed
        LocalDate givenDate = LocalDate.of(2023, 5, 10); //other day
        LocalDate today = LocalDate.now(); //today

        // Difference in days
        long daysBetween = ChronoUnit.DAYS.between(givenDate, today);
        
        System.out.println("Days between: " + daysBetween); 
    }
}