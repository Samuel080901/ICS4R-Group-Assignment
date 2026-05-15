    /**
 * Subclass called Food, superclass is Item.
 *
 * @author (Jenny Bi)
 * @version (May 8, 2026)
 */
//S:import date 
import java.time.LocalDate;

//S: changed the strExpiryday into object/variable type  

//R implementing serializable to save an rebuild saved objects
import java.io.Serializable;

public class Food extends Item implements Serializable
{
    //J instance variables
    private LocalDate ExpiryDay; //J specific date of expiry, etc. May 9th, 2026
    
    //J output all info
    @Override
    public String toString()
    {
        return this.strName+" "+this.fltPrice+" "+this.bytItemAmount+" "+this.ExpiryDay;
    }
    
    //J default constructor
    Food()
    {
        super();
        this.ExpiryDay = LocalDate.now();
    }
    //J constructor
    Food( String n, float p ,byte a)
    {
        super(n, p, a);
        this.ExpiryDay = randomDate();
    }
    
    //J getters and setters
    void setExpiryDay(String e)
    {
        this.ExpiryDay = randomDate();
    }
    LocalDate getExpiryDay()
    {
        return this.ExpiryDay;
    }
    //create a method that create a random future date
    public LocalDate randomDate(){
        int n = (int)(Math.random()*100);
        LocalDate currentDate = LocalDate.now();
        return currentDate.plusDays(n);
    }
    
}