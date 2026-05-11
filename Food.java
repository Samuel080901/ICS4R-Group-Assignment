/**
 * Subclass called Food, superclass is Item.
 *
 * @author (Jenny Bi)
 * @version (May 8, 2026)
 */
public class Food extends Item
{
    //J instance variables
    private String strExpiryDay; //J specific date of expiry, etc. May 9th, 2026
    
    //J default constructor
    Food()
    {
        super();
        this.strExpiryDay = "UNKNOWN";
    }
    //J constructor
    Food(String e, String n, float p, byte a)
    {
        super(n, p, a);
        this.strExpiryDay = e;
    }
    
    //J getters and setters
    void setExpiryDay(String e)
    {
        this.strExpiryDay = e;
    }
    String getExpiryDay()
    {
        return this.strExpiryDay;
    }
}