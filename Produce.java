/**
 * Subclass called Produce, superclass is Food, supersuper class is Item
 *
 * @author (Jenny Bi)
 * @version (May 8, 2026)
 */
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.io.Serializable;
public class Produce extends Food implements Serializable
{
    //J instance variables
    private boolean bolLocal;
    private byte bytDaysExpired; //J this shows days until expiry, ex. -1 is 1 day until expiry
    private float fltWeight; //J weight in pounds
    
    //J conversion method
    public float weightToPrice()
    {
        return this.fltPrice*fltWeight;
    }
    //J method to calculate expiry date 
    public byte calculateExpiryDate(){
        //J test substracting 2 different dates to find out how many dates passed
        LocalDate givenDate = getExpiryDay(); //other day
        LocalDate today = LocalDate.now(); //today

        // Difference in days
        byte daysBetween = (byte)(ChronoUnit.DAYS.between(givenDate, today));
    
    
        return daysBetween;
    
    }
    
    //J output all info
    @Override 
    public String toString()
    {
        return this.strName+" "+this.fltPrice+" "+this.bytItemAmount+" "+this.bolLocal+" "+this.bytDaysExpired+" "+this.fltWeight;
    }
    
    //J Default Constructor
    Produce()
    {
        super();
        this.bolLocal = false;
        this.bytDaysExpired = 127;
        this.fltWeight = -1;
    }
    //J Constructor
    Produce(String n,float p,byte a, boolean l, float w)
    {
        super( n,p, a);
        this.bolLocal = l;
        this.bytDaysExpired = calculateExpiryDate();
        this.fltWeight = w;
    }
    
    //J getters and setters
    void setLocal(boolean l)
    {
        this.bolLocal = l;
    }
    void setDaysExpired(byte d)
    {
        this.bytDaysExpired = d;
    }
    void setWeight(float w)
    {
        this.fltWeight = w;
    }
    public boolean getLocal()
    {
        return this.bolLocal;
    }
    public byte getDaysExpired()
    {
        return this.bytDaysExpired;
    }
    public float getWeight()
    {
        return this.fltWeight;
    }
}